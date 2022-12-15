package com.example.pokedex.models;

public class Pokemon {
    public int id;
    public String name;
    public Long height;
    public Long weight;

    public Pokemon(int id, String name, Long height, Long weight)
    {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
