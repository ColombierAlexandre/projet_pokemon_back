package com.intiformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
