package com.mitocode.interfaceServicio;

import java.util.List;
import java.util.Optional;

import com.mitocode.modelo.Usuario;

public interface IUsuarioServicio {
	
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int idCliente);
	public int save (Usuario u);
	public void delate (int idCliente);
	

}
