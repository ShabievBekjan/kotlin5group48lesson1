package com.geektech.kotlin5group48lesson1.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.geektech.kotlin5group48lesson1.data.model.NoteEntity

@Dao
interface NoteDao {

   @Insert
   fun createNote(noteEntity: NoteEntity)

   @Update
   fun editNote(noteEntity: NoteEntity)
   @Delete
   fun deleteNote(noteEntity: NoteEntity)
   @Query ("SELECT * FROM notes")
   fun getNotes(): List<NoteEntity>
}