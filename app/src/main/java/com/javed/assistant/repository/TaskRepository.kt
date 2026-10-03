package com.javed.assistant.repository

import com.javed.assistant.data.dao.TaskDao
import com.javed.assistant.data.models.Task
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {
    fun getAllTasks(): Flow<List<Task>> = taskDao.getAllTasks()
    fun getActiveTasks(): Flow<List<Task>> = taskDao.getActiveTasks()
    suspend fun insertTask(task: Task) = taskDao.insert(task)
    suspend fun updateTask(task: Task) = taskDao.update(task)
    suspend fun deleteTask(task: Task) = taskDao.delete(task)
    suspend fun markAsComplete(id: String) = taskDao.markAsComplete(id)
}
