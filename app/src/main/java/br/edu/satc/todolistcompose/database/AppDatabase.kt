package br.edu.satc.todolistcompose.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.edu.satc.todolistcompose.data.TaskDao
import br.edu.satc.todolistcompose.data.TaskData

@Database(entities = [TaskData::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}