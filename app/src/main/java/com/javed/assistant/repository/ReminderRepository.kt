package com.javed.assistant.repository

import com.javed.assistant.data.dao.ReminderDao
import com.javed.assistant.data.models.Reminder
import kotlinx.coroutines.flow.Flow

class ReminderRepository(private val reminderDao: ReminderDao) {
    fun getAllReminders(): Flow<List<Reminder>> = reminderDao.getAllReminders()
    fun getUpcomingReminders(now: Long): Flow<List<Reminder>> = reminderDao.getUpcomingReminders(now)
    suspend fun insertReminder(reminder: Reminder) = reminderDao.insert(reminder)
    suspend fun updateReminder(reminder: Reminder) = reminderDao.update(reminder)
    suspend fun deleteReminder(reminder: Reminder) = reminderDao.delete(reminder)
    suspend fun markAsNotified(id: String) = reminderDao.markAsNotified(id)
}
