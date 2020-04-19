package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pasajero;
import com.example.demo.dto.Vuelo;
import com.example.demo.service.PasajeroServiceImpl;
import com.example.demo.service.VueloServiceImpl;

@RestController
@RequestMapping("/api")
public class VueloController {
	
	@Autowired
	VueloServiceImpl vueloServiceImpl;
	
	@GetMapping("/vuelos")
	public List<Vuelo> listarVuelos(){
		return vueloServiceImpl.listarVuelos();
	}

}
