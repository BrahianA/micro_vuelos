package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
