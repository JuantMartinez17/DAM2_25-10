package com.example.dam2_18_10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dam2_18_10.adapter.AlumnosAdapter
import com.example.dam2_18_10.data.Alumno
import com.example.dam2_18_10.data.AlumnosRepository
import com.example.dam2_18_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initRecycler(AlumnosRepository.alumnosList)
    }

    private fun initRecycler(alumnos: List<Alumno>) {
        binding.rvStudents.layoutManager = LinearLayoutManager(this)
        binding.rvStudents.adapter = AlumnosAdapter(alumnos)
    }
}