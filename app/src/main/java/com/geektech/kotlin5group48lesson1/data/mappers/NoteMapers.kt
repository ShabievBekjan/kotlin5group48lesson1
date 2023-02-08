package com.geektech.kotlin5group48lesson1.data.mappers

import com.geektech.kotlin5group48lesson1.data.model.NoteEntity
import com.geektech.kotlin5group48lesson1.domain.model.Note


fun NoteEntity.toNot() = Note(
    this.id,
    this.title,
    this.description,
    this.createdAt,
)




fun Note.toNotEntity() = NoteEntity(
    this.id,
    this.title,
    this.description,
    this.createdAt,
)
