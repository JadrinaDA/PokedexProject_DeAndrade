package com.example.pokedex;


import com.example.pokedex.controllers.PokedexController;
import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonDB;
import com.example.pokedex.utilities.ConsoleLogUtility;
import com.example.pokedex.utilities.FileLogUtility;
import com.example.pokedex.views.ConsoleView;
import com.example.pokedex.views.HTMLView;

import java.io.IOException;
import java.sql.SQLException;

public class Pokedex {

    public static void main(String[] args){
        System.out.println("It's working !");
        if (args.length > 0) {
            System.out.println("Vous avez fourni l'argument " + args[0]);
        }
        PokedexController pokedexController = new PokedexController();
        boolean use_db = false;
        if (args.length > 1)
        {
            use_db = true;
        }
        ConsoleView consoleView = new ConsoleView(use_db);
        HTMLView htmlView = new HTMLView(use_db);
        if (use_db)
        {
            consoleView.setPokemonDB(pokedexController.getPokemonDB(Integer.parseInt(args[0]), args[1]));
            htmlView.setPokemonDB(pokedexController.getPokemonDB(Integer.parseInt(args[0]), args[1]));
        }
        else {
            consoleView.setPokemon(pokedexController.getPokemon(Integer.parseInt(args[0])));
            htmlView.setPokemon(pokedexController.getPokemon(Integer.parseInt(args[0])));
        }
        ConsoleLogUtility consoleLogUtility = new ConsoleLogUtility();
        FileLogUtility fileLogUtility = new FileLogUtility();
        consoleLogUtility.logTextToConsole(consoleView);
        try {
            fileLogUtility.logHtmlToFile("output.html", htmlView);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String getName() {
        return "Hello";
    }
}
