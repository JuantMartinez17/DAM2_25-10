package com.example.dam2_18_10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dam2_18_10.adapter.AlumnosAdapter
import com.example.dam2_18_10.model.Alumno
import com.example.dam2_18_10.model.AlumnosRepository
import com.example.dam2_18_10.databinding.ActivityMainBinding
import com.example.dam2_18_10.viewmodel.ViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModel()
        viewModel.students.observe(this){ alumno->
            initRecycler(AlumnosRepository.alumnosList)
        }
    }

    private fun initRecycler(alumnos: List<Alumno>) {
        binding.rvStudents.layoutManager = LinearLayoutManager(this)
        binding.rvStudents.adapter = AlumnosAdapter(alumnos)
    }
}