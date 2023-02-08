package com.geektech.kotlin5group48lesson1.domain.usescases

import com.geektech.kotlin5group48lesson1.domain.model.Note
import com.geektech.kotlin5group48lesson1.domain.repository.NoteRepository

class CreateNoteUseCases(
    private val noteRepository: NoteRepository
) {
    fun createNote(note: Note) = noteRepository.createNote(note)
}