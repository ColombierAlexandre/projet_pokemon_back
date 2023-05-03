package com.intiformation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPokemon;
	private String nom;
	private String type;
	private String imageUrl;
	public Pokemon() {
	}
	public Pokemon(String nom, String type, String imageUrl) {
		this.nom = nom;
		this.type = type;
		this.imageUrl = imageUrl;
	}
	public Pokemon(Long idPokemon, String nom, String type, String imageUrl) {
		this.idPokemon = idPokemon;
		this.nom = nom;
		this.type = type;
		this.imageUrl = imageUrl;
	}
	public Long getIdPokemon() {
		return idPokemon;
	}
	public void setIdPokemon(Long idPokemon) {
		this.idPokemon = idPokemon;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	

}
