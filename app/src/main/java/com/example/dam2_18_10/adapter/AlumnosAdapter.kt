package com.example.dam2_18_10.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dam2_18_10.R
import com.example.dam2_18_10.model.Alumno

class AlumnosAdapter (val listAlumnos: List<Alumno>): RecyclerView.Adapter<AlumnoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.alumno_item, parent, false)
        return AlumnoViewHolder(layoutInflater)
    }
    override fun getItemCount(): Int {
        return listAlumnos.size
    }
    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val item = listAlumnos[position]
        holder.bind(item)
    }
}