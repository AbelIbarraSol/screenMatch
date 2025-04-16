package com.strangecorp.screenmatch.models;

import com.strangecorp.screenmatch.calculations.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    public Pelicula(String nombre, String genero, String director, String pais, String idioma, String sinopsis, int lanzamiento, int duracion, boolean incluidoEnElPlan, boolean postCreditos) {
        super(nombre, genero, director, pais, idioma, sinopsis, lanzamiento, duracion, incluidoEnElPlan, postCreditos);
    }

    @Override
    public int getClasificacion() {
        return (int) (calculoDeMedia() / 2);
    }
}
