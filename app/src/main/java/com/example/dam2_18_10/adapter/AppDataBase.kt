package com.example.dam2_18_10.adapter

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dam2_18_10.UserDao
import com.example.dam2_18_10.data.Alumno

@Database(entities = [Alumno::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
}