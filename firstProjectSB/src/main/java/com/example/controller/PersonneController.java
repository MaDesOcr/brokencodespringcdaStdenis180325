package com.example.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Personne;
import com.example.service.PersonneService;
import com.mysql.cj.protocol.x.XProtocolError;

@Controller
public class PersonneController {

	@Autowired
	PersonneService personneService;

	@GetMapping("/getPersonnes")
	public ArrayList<Personne> getPersonnes(){
		return personneService.getAllPersonnes();
	}
	
	@GetMapping("/getPersonneById")
	public Optional<Personne> getPersonneById(@RequestParam long id) {
		return personneService.getPersonneById(id);
	}
	
	//localhost:8081/deletePersonneById?id=1
	@DeleteMapping("/deletePersonneById")
	public void deletePersonneById(@RequestParam long id){
		personneService.deletePersonneById(id);
	}
	
	
	//updatePersonneById attention, on ne va pas utiliser un requestParam, mais un requestBody
	@PutMapping("/updatePersonneById/{id}")
	public void updatePersonneById(@PathVariable long id,
			@RequestBody Personne personne){
		personneService.update(personne, id);
	}

	@PostMapping("/addPersonne")
	public boolean addPersonne(@RequestBody Personne personne) {
		personneService.addPersonne(personne);
		return true;
	}
}
