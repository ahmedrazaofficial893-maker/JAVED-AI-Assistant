package com.javed.assistant.repository

import com.javed.assistant.data.dao.NoteDao
import com.javed.assistant.data.models.Note
import kotlinx.coroutines.flow.Flow

class NoteRepository(private val noteDao: NoteDao) {
    fun getAllNotes(): Flow<List<Note>> = noteDao.getAllNotes()
    fun searchNotes(query: String): Flow<List<Note>> = noteDao.searchNotes(query)
    suspend fun insertNote(note: Note) = noteDao.insert(note)
    suspend fun updateNote(note: Note) = noteDao.update(note)
    suspend fun deleteNote(note: Note) = noteDao.delete(note)
}
