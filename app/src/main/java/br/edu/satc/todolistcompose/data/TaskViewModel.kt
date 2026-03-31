package br.edu.satc.todolistcompose.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TaskViewModel(private val taskDao: TaskDao) : ViewModel() {
    val tasks = taskDao.getAll()

    fun insert(task: TaskData) {
        viewModelScope.launch {
            taskDao.insert(task)
        }
    }

    fun update(task: TaskData) {
        viewModelScope.launch {
            taskDao.update(task)
        }
    }
}