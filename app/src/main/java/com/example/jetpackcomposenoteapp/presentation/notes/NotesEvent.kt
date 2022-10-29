package com.example.jetpackcomposenoteapp.presentation.notes

import com.example.jetpackcomposenoteapp.domain.model.Note
import com.example.jetpackcomposenoteapp.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}