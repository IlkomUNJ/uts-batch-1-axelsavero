package com.example.midtermexam

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

data class Student(
    val id: String,
    val name: String,
    val phone: String,
    val address: String
)

object StudentRepository {
    val studentList: SnapshotStateList<Student> = mutableStateListOf()
}