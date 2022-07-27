package ir.MrMohamadHosein.genericroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Todo::class, Student::class, Anbar::class, Food::class, Emtehan::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract val todoDao: TodoDao
    abstract val studentDao: StudentDao
    abstract val anbarDao: AnbarDao
    abstract val foodDao: FoodDao
    abstract val emtehanDao: EmtehanDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {

                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_dataBase.db"
                    )
                        .allowMainThreadQueries()
                        .build()
                }

                return instance
            }
        }

    }

}