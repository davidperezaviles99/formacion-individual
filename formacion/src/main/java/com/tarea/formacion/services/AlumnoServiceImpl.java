package com.tarea.formacion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tarea.formacion.dao.AlumnoDao;
import com.tarea.formacion.entity.Alumno;
import com.tarea.formacion.entity.Comunidad;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoDao alumnoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		return (List<Alumno>) alumnoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Alumno findbyId(Long Id) {
		return alumnoDao.findById(Id).orElse(null);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		alumnoDao.deleteById(id);
		
	}
	
	@Override
	@Transactional
	public List<Comunidad> findAllcomunidades(){
		return alumnoDao.findAllcomunidades();
	}

}
