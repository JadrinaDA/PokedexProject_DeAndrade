package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonDB;
import com.example.pokedex.utilities.TextGeneratorInterface;

public class ConsoleView implements TextGeneratorInterface {

    private Pokemon pokemon;
    private PokemonDB pokemonDB;
    private boolean db;

    public ConsoleView(boolean db){
        this.db = db;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void setPokemonDB(PokemonDB pokemonDB) {
        this.pokemonDB = pokemonDB;
    }

    public String generateText(){
        String text = "";
        text += "=============================\n";
        if (this.db)
        {
            text += "Pokémon number: " + this.pokemonDB.id + "\n";
            text += "Name: " + this.pokemonDB.name  + "\n";
            text += "Height: " + this.pokemonDB.height  + "\n";
            text += "Weight: " + this.pokemonDB.weight  + "\n";
            text += "Description: " + this.pokemonDB.description  + "\n";
        }
        else {
            text += "Pokémon number: " + this.pokemon.id + "\n";
            text += "Name: " + this.pokemon.name  + "\n";
            text += "Height: " + this.pokemon.height  + "\n";
            text += "Weight: " + this.pokemon.weight  + "\n";
        }
        text += "=============================\n";
        return text;
    }
}

