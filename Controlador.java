package com.mitocode.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mitocode.interfaceServicio.IUsuarioServicio;
import com.mitocode.modelo.Usuario;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IUsuarioServicio servicio;
	
	public String listar (Model model) {
		List<Usuario>usuarios=servicio.listar();
		model.addAttribute("usuarios", usuarios);
		return "index";
	}
	

}
