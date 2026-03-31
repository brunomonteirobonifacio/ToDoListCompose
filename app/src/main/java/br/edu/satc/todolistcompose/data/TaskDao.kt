package br.edu.satc.todolistcompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * FROM task")
    fun getAll(): Flow<List<TaskData>>

    @Query("SELECT * FROM task WHERE id in (:ids)")
    fun loadAllByIds(ids: IntArray): List<TaskData>

    @Insert
    suspend fun insert(task: TaskData)

    @Update
    suspend fun update(task: TaskData)
}