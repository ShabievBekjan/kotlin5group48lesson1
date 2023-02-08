package com.geektech.kotlin5group48lesson1.domain.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.geektech.kotlin5group48lesson1.domain.model.Note


interface NoteRepository {

    fun createNote(noteEntity: Note)

    fun editNote(noteEntity: Note)

    fun deleteNote(noteEntity: Note)

    fun getNotes(): List<Note>

}


