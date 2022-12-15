package com.example.pokedex.services;

import java.sql.*;

public class GetInfoDB implements GetInfoInterface{
    private ResultSet rs;
    public void getInfo(int id) {
        /* Connect to the database */
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:../sujet_TP/ressources/pokemondatabase.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

            PreparedStatement stmt  = conn.prepareStatement("SELECT name, description, height, weight FROM pokemons WHERE id = ?");
            stmt.setInt(1, id); // Sets the value "3" for parameter at position 1
            ResultSet rs    = stmt.executeQuery();
            rs.next();
            this.rs = rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String getStringInfo(String propName) {
        try {
            return rs.getString(propName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long getLongInfo(String propName) {
        try {
            return rs.getLong(propName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
