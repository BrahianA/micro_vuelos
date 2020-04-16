package com.mitocode.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.mitocode.modelo.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
