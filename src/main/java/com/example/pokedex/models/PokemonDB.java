package com.example.pokedex.models;

public class PokemonDB extends Pokemon{

    public String description;

    public PokemonDB(int id, String name, Long height, Long weight, String description)
    {
        super(id, name, height, weight);
        this.description = description;
    }
}
