package com.geektech.kotlin5group48lesson1.data.repository

import com.geektech.kotlin5group48lesson1.data.local.NoteDao
import com.geektech.kotlin5group48lesson1.data.mappers.toNot
import com.geektech.kotlin5group48lesson1.data.mappers.toNotEntity
import com.geektech.kotlin5group48lesson1.domain.model.Note
import com.geektech.kotlin5group48lesson1.domain.repository.NoteRepository

class NoteRepositorylmpl(
    private val noteDao:NoteDao
):NoteRepository {

    override fun createNote(note: Note) {
       noteDao.createNote(note.toNotEntity())
    }

    override fun editNote(note: Note) {
       noteDao.editNote(note.toNotEntity())
    }

    override fun deleteNote(note: Note) {
       noteDao.deleteNote(note.toNotEntity())
    }

    override fun getNotes() : List<Note> {
    return noteDao.getNotes().map {(it.toNot())
       }
    }
}