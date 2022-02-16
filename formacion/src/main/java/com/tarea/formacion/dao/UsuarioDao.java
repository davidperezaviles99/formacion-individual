package com.tarea.formacion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarea.formacion.entity.Usuario;


@Repository
public interface UsuarioDao extends CrudRepository<Usuario,Long> {

	public Usuario findByUsername(String username);

}