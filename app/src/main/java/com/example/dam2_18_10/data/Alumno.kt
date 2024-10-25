package com.example.dam2_18_10.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Alumno(
    @PrimaryKey val id: Int,
    @ColumnInfo (name = "Name") val name: String,
    val lastName: String,
    val dni: String,
    val city: String,
    val cp: String,
)
