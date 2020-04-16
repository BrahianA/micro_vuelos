package com.mitocode.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitocode.interfaceServicio.IUsuarioServicio;
import com.mitocode.interfaces.IUsuario;
import com.mitocode.modelo.Usuario;

public class UsuarioServicio implements IUsuarioServicio {

	@Autowired
	private IUsuario data;
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return (List<Usuario>) data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delate(int idCliente) {
		// TODO Auto-generated method stub
		
	}

}
