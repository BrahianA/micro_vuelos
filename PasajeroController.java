package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Pasajero;
import com.example.demo.service.PasajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class PasajeroController {

	@Autowired
	PasajeroServiceImpl pasajeroServiceImpl;
	
	@GetMapping("/pasajeros")
	public List<Pasajero> listarPasajero(){
		return pasajeroServiceImpl.listarPasajeros();
	}
	
	@PostMapping("/pasajeros")
	public Pasajero salvarpasajero(@RequestBody Pasajero pasajero) {
		
		return pasajeroServiceImpl.guardarPasajero(pasajero);
	}
	
	@GetMapping("/pasajeros/{numeroIdentificacion}")
	public Pasajero clienteXID (Long numeroIdentificacion) {
		
		Pasajero pasajero_xid = new Pasajero();
		
		pasajero_xid=pasajeroServiceImpl.clientePorId(numeroIdentificacion);
		
		System.out.println("Pasajero seleccionado: "+ pasajero_xid);
		
		return pasajero_xid;
	}
	
	@PutMapping("/pasajeros/{numeroIdentificacion}")
	public Pasajero actualizarPasajero (@PathVariable (name ="numeroIdentificacion") Long numeroIdentificacion,@RequestBody Pasajero pasajero) {
		
		Pasajero pasajero_seleccionado=new Pasajero();
		Pasajero pasajero_actualizado=new Pasajero();
		
	    pasajero_seleccionado=pasajeroServiceImpl.clientePorId(numeroIdentificacion);
	    pasajero_seleccionado.setNombres(pasajero.getNombres());
	    pasajero_seleccionado.setApellidos(pasajero.getApellidos());
	    pasajero_seleccionado.setCorreo(pasajero.getCorreo());
	    pasajero_seleccionado.setTelefono(pasajero.getTelefono());
	    
	    pasajero_actualizado=pasajeroServiceImpl.actualizarPasajero(pasajero_seleccionado);
		
	    System.out.println("El pasajero actualizado es: "+ pasajero_actualizado);
	    
	    return  pasajero_actualizado;
		
	}
	
	@DeleteMapping("/pasajeros/{numeroIdentificacion}")
	public void eliminarPasajero (@PathVariable (name ="numeroIdentificacion")Long numeroIdentificacion) {
		
		pasajeroServiceImpl.eliminarPasajero(numeroIdentificacion);
	}
}
