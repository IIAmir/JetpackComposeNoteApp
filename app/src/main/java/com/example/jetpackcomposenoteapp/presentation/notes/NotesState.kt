package com.example.jetpackcomposenoteapp.presentation.notes

import com.example.jetpackcomposenoteapp.domain.model.Note
import com.example.jetpackcomposenoteapp.domain.util.NoteOrder
import com.example.jetpackcomposenoteapp.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
