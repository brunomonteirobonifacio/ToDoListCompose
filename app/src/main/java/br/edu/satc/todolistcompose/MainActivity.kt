package br.edu.satc.todolistcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.room.Room
import br.edu.satc.todolistcompose.data.TaskViewModel
import br.edu.satc.todolistcompose.database.AppDatabase
import br.edu.satc.todolistcompose.ui.screens.HomeScreen
import br.edu.satc.todolistcompose.ui.theme.ToDoListComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "app-database"
        ).build()

        val taskViewModel = TaskViewModel(db.taskDao())

        setContent {
            ToDoListComposeTheme {
                HomeScreen(taskViewModel)
            }
        }
    }
}
