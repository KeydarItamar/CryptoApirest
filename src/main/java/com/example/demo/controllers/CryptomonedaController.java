package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Cryptomoneda;
import com.example.demo.repository.CryptoRepository;

@RestController
@RequestMapping("/Crypto")
public class CryptomonedaController {
	
	@Autowired
	CryptoRepository cr;
	
	@GetMapping("/mostrarTodo")
	public ArrayList <Cryptomoneda> mostrarCryptos(){
		return (ArrayList <Cryptomoneda>)cr.findAll();
	}

	@GetMapping("/mostrar/{id}")
	public Optional <Cryptomoneda> mostrarCrypto(@PathVariable int id) {
		return cr.findById(id);
	}
	
	@GetMapping("/mostrarNombre/{nombre}")
	public Optional <Cryptomoneda> mostrarCrypto(@PathVariable String nombre) {
		return cr.findByNombre(nombre);
	}
	
	
	
	
}
