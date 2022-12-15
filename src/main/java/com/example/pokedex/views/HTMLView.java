package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonDB;
import com.example.pokedex.utilities.HTMLGeneratorInterface;

public class HTMLView implements HTMLGeneratorInterface {

    private Pokemon pokemon;
    private PokemonDB pokemonDB;
    private boolean db;

    public HTMLView(boolean db){
        this.db = db;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void setPokemonDB(PokemonDB pokemonDB) {
        this.pokemonDB = pokemonDB;
    }

    public String generateHtml(){
        String text = "";
        if (this.db)
        {
            text += "<h1>" + this.pokemonDB.name + "</h1>\n";
            text += "<ul>\n";
            text += "<li>Id : " + this.pokemonDB.id + "</li>\n";
            text += "<li>Height : " + this.pokemonDB.height + "</li>\n";
            text += "<li>Weight : " + this.pokemonDB.weight + "</li>\n";
            text += "<li>Description : " + this.pokemonDB.description + "</li>\n";
        }
        else {
            text += "<h1>" + this.pokemon.name + "</h1>\n";
            text += "<ul>\n";
            text += "<li>Id : " + this.pokemon.id + "</li>\n";
            text += "<li>Height : " + this.pokemon.height + "</li>\n";
            text += "<li>Weight : " + this.pokemon.weight + "</li>\n";
        }
        text += "</ul>\n";
        return text;
    }
}
