package com.example.jetpackcomposenoteapp.domain.use_case

import com.example.jetpackcomposenoteapp.domain.model.Note
import com.example.jetpackcomposenoteapp.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}