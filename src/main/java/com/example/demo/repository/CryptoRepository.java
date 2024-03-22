package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Cryptomoneda;

@Repository
public interface CryptoRepository extends CrudRepository <Cryptomoneda , Integer> {
   
	
	Optional<Cryptomoneda> findByNombre(String nombre);


}
