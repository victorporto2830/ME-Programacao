package com.example.osorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.osorio.model.Crud;
import com.example.osorio.repository.CrudRepository;


@RestController
@RequestMapping("/curso")
public class CrudController {

	@Autowired
	private CrudRepository cursoRepository;
	
	@GetMapping("/catalogar")
	public List<Crud> catalogar() {
		return cursoRepository.findAll();
	}
	
	@PostMapping("/cadastrar")
	public Crud cadastrar(@RequestBody Crud curso) {
		return cursoRepository.save(curso);
	}
	
	@DeleteMapping("/deletar")
	public void deletar(@RequestBody Crud curso) {
		cursoRepository.delete(curso);
	}
	
	@PutMapping("/editar")
	public Crud editar(@RequestBody Crud curso) {
		return cursoRepository.save(curso);
	}
	
}
