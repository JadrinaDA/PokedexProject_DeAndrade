package com.example.pokedex.controllers;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonDB;
import com.example.pokedex.services.GetInfoAPI;
import com.example.pokedex.services.GetInfoDB;
import org.json.simple.JSONObject;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PokedexController {
    private GetInfoAPI getInfoAPI = new GetInfoAPI();
    private GetInfoDB getInfoDB = new GetInfoDB();

    public Pokemon getPokemon(int id){
        this.getInfoAPI.getInfo(id);
        String name = this.getInfoAPI.getStringInfo("name");
        Long height = this.getInfoAPI.getLongInfo("height");
        Long weight = this.getInfoAPI.getLongInfo("weight");
        Pokemon pokemon = new Pokemon(id, name, height, weight);
        return pokemon;
    }

    public PokemonDB getPokemonDB(int id, String db_url)
    {
        this.getInfoDB.getInfo(id, db_url);
        String name = this.getInfoDB.getStringInfo("name");
        Long height = this.getInfoDB.getLongInfo("height");
        Long weight = this.getInfoDB.getLongInfo("weight");
        String description = this.getInfoDB.getStringInfo("description");

        PokemonDB pokemonDB = new PokemonDB(id, name, height, weight, description);
        return pokemonDB;
    }
}
