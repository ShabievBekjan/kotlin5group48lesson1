package com.geektech.kotlin5group48lesson1.domain.usescases

import com.geektech.kotlin5group48lesson1.domain.repository.NoteRepository

class GetNotesUsesCases (
    private val noteRepository: NoteRepository
) {

    fun getNotes() = noteRepository.getNotes()
    }
