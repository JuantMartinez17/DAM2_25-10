package com.example.dam2_18_10.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.dam2_18_10.data.Alumno
import com.example.dam2_18_10.databinding.AlumnoItemBinding

class AlumnoViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = AlumnoItemBinding.bind(view)

    fun bind(alumno: Alumno){
        binding.tvStudentName.text = alumno.name
        binding.tvStudentLastName.text = alumno.lastName
        binding.tvStudentLastName.text = alumno.dni
    }
}