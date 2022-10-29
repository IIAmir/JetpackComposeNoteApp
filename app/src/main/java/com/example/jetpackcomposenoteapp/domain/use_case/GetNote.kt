package com.example.jetpackcomposenoteapp.domain.use_case

import com.example.jetpackcomposenoteapp.domain.model.Note
import com.example.jetpackcomposenoteapp.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }

}