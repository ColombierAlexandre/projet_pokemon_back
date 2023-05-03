package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.PokemonRepository;
import com.intiformation.model.Pokemon;

@Service
public class PokemonService {
	
	private PokemonRepository pokemonRepository;
	
	@Autowired
	public void setPokemonRepository(PokemonRepository pokemonRepository) {
		this.pokemonRepository = pokemonRepository;
	}
	
	public Pokemon addPokemon(Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public Pokemon updatePokemon(Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public void deletePokemon(Long idPokemon) {
		pokemonRepository.deleteById(idPokemon);
	}
	
	public Pokemon getPokemonById(Long idPokemon) {
		Optional<Pokemon> optPokemon = pokemonRepository.findById(idPokemon);
		if(optPokemon.isPresent()) {
		return optPokemon.get();
		}
		return null;
	}
	
	public List<Pokemon> getAllPokemon(){
		return pokemonRepository.findAll();
	}
	
	

}
