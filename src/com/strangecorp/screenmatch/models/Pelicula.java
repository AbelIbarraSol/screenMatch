package com.strangecorp.screenmatch.models;

public class Pelicula extends Titulo{

    public Pelicula(String nombre, String genero, String director, String pais, String idioma, String sinopsis, int lanzamiento, int duracion, boolean incluidoEnElPlan, boolean postCreditos) {
        super(nombre, genero, director, pais, idioma, sinopsis, lanzamiento, duracion, incluidoEnElPlan, postCreditos);
    }
}
