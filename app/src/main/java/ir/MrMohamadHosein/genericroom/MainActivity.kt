package ir.MrMohamadHosein.genericroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoDao = AppDatabase.getInstance(this).todoDao
        val studentDao = AppDatabase.getInstance(this).studentDao
        val emtehanDao = AppDatabase.getInstance(this).emtehanDao
        val anbarDao = AppDatabase.getInstance(this).anbarDao
        val foodDao = AppDatabase.getInstance(this).foodDao

        todoDao.insert(Todo(title = "todo1", content = "todoDetail"))
        todoDao.insert(Todo(title = "todo2", content = "todoDetail"))
        todoDao.insert(Todo(title = "todo3", content = "todoDetail"))

        studentDao.insert(Student(name = "hamid", studentId = "988475"))
        studentDao.insert(Student(name = "reza", studentId = "98472375"))
        studentDao.insert(Student(name = "ali", studentId = "984778525"))

        emtehanDao.insert(Emtehan(emtehanName = "riazi", emtehanMaxScore = 20))
        emtehanDao.insert(Emtehan(emtehanName = "goghrafi", emtehanMaxScore = 20))
        emtehanDao.insert(Emtehan(emtehanName = "fizik", emtehanMaxScore = 20))

        anbarDao.insert(Anbar(anbarName = "anbar1", anbarNumber = 26))
        anbarDao.insert(Anbar(anbarName = "anbar2", anbarNumber = 56))
        anbarDao.insert(Anbar(anbarName = "anbar3", anbarNumber = 276))

        foodDao.insert(Food(foodName = "Morgh", foodPrice = "20000"))
        foodDao.insert(Food(foodName = "Rice", foodPrice = "20000"))
        foodDao.insert(Food(foodName = "Kebab", foodPrice = "20000"))


        // log data from database =>
        Log.v("dataFromDataBase", " todo => " + todoDao.getAllTodo().toString())
        Log.v("dataFromDataBase", " student => " + studentDao.getAllStudent().toString())
        Log.v("dataFromDataBase", " emtehan => " + emtehanDao.getAllEmtehan().toString())
        Log.v("dataFromDataBase", " anbar => " + anbarDao.getAllAnbar().toString())
        Log.v("dataFromDataBase", " food => " + foodDao.getAllFood().toString())


    }
}