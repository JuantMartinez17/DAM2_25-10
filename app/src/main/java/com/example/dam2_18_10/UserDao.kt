package com.example.dam2_18_10

import androidx.room.Dao
import androidx.room.Query
import com.example.dam2_18_10.model.Alumno

@Dao
interface UserDao {
    @Query("SELECT * FROM alumno")
    fun getAll(): List<Alumno>
}