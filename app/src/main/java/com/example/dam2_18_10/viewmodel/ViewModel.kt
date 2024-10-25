package com.example.dam2_18_10.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dam2_18_10.model.Alumno
import com.example.dam2_18_10.model.AlumnosRepository

class ViewModel {
    private val _students = MutableLiveData<List<Alumno>>()
    val students: LiveData<List<Alumno>> = _students
    init {
        _students.value = AlumnosRepository.alumnosList
    }

}