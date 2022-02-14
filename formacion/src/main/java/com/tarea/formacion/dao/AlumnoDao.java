package com.tarea.formacion.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarea.formacion.entity.Alumno;
import com.tarea.formacion.entity.Comunidad;

@Repository
public interface AlumnoDao extends CrudRepository<Alumno, Long>{

	@Query("from Comunidad")
	List<Comunidad> findAllcomunidades();

}
