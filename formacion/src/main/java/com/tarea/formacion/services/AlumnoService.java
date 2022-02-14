package com.tarea.formacion.services;

import java.util.List;

import com.tarea.formacion.entity.Alumno;
import com.tarea.formacion.entity.Comunidad;

public interface AlumnoService {
	
	public List<Alumno> findAll();
	
	public Alumno findbyId(Long Id);
	
	public Alumno save(Alumno alumno);
	
	public void delete(Long id);
	
	public List<Comunidad> findAllcomunidades();

}
