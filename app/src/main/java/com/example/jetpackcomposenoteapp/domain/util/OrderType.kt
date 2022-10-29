package com.example.jetpackcomposenoteapp.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
