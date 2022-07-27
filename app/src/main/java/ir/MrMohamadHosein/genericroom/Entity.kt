package ir.MrMohamadHosein.genericroom

import androidx.room.Entity
import androidx.room.PrimaryKey

// ------------------------------------------------

@Entity(tableName = "todo_table")
data class Todo(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    var title: String,
    var content: String
)

// ------------------------------------------------

@Entity(tableName = "student_table")
data class Student(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    var name: String,
    var studentId: String
)

// ------------------------------------------------

@Entity(tableName = "anbar_table")
data class Anbar(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    var anbarName: String,
    var anbarNumber: Int
)

// ------------------------------------------------

@Entity(tableName = "food_table")
data class Food(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    var foodName: String,
    var foodPrice: String
)

// ------------------------------------------------

@Entity(tableName = "emtehan_table")
data class Emtehan(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    var emtehanName: String,
    var emtehanMaxScore: Int
)

// ------------------------------------------------