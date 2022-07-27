package ir.MrMohamadHosein.genericroom

import androidx.room.*

interface BaseDao<T> {

    @Insert
    fun insert(obj: T)

    @Update
    fun update(obj: T)

    @Delete
    fun delete(obj: T)

}

@Dao
interface TodoDao : BaseDao<Todo> {

    @Query("SELECT * from todo_table ")
    fun getAllTodo(): List<Todo>

}

@Dao
interface StudentDao : BaseDao<Student> {
    @Query("SELECT * from student_table ")
    fun getAllStudent(): List<Student>
}

@Dao
interface EmtehanDao : BaseDao<Emtehan> {
    @Query("SELECT * from emtehan_table ")
    fun getAllEmtehan(): List<Emtehan>
}

@Dao
interface FoodDao : BaseDao<Food> {
    @Query("SELECT * from food_table ")
    fun getAllFood(): List<Food>
}

@Dao
interface AnbarDao : BaseDao<Anbar> {

    @Query("SELECT * from anbar_table ")
    fun getAllAnbar(): List<Anbar>

}