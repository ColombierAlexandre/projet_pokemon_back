package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.model.Pokemon;
import com.intiformation.service.PokemonService;

@RestController
@RequestMapping("/pokemonapi")
@CrossOrigin("http://localhost:4200")
public class PokemonController {
	
	/*
	 * Commentaire pour git
	 * */
	/*
	 * Ajout d'un autre contributeur
	 * */
	/*
	 * Ajout d'un nouveau commentaire
	 * */
	
	private PokemonService pokemonService;
	
	@Autowired
	public void setPokemonService(PokemonService pokemonService) {
		this.pokemonService = pokemonService;
	}

	@PostMapping
	public Pokemon ajouterPokemon(@RequestBody Pokemon pokemon) {
		return pokemonService.addPokemon(pokemon);
	}
	
	@PutMapping
	public Pokemon updatePokemon(@RequestBody Pokemon pokemon) {
		return pokemonService.updatePokemon(pokemon);
	}
	
	@DeleteMapping("/{id}")
	public void deletePokemon(@PathVariable("id") Long idPokemon) {
		pokemonService.deletePokemon(idPokemon);
	}
	
	@GetMapping("/{id}")
	public Pokemon getPokemonById(@PathVariable("id") Long idPokemon) {
		return pokemonService.getPokemonById(idPokemon);
	}
	
	@GetMapping
	public List<Pokemon> getAllPokemon(){
		return pokemonService.getAllPokemon();
	}

}
