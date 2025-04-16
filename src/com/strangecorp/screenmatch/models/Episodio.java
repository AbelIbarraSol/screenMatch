package com.strangecorp.screenmatch.models;

import com.strangecorp.screenmatch.calculations.Clasificacion;

public class Episodio implements Clasificacion {
    private String nombre;
    private int numero;
    private int temporada;
    private String sinopsis;
    private int duracion;
    private Serie serie;
    private int totalDeVisualizaciones;

    public Episodio(String nombre, int numero, int temporada, String sinopsis, int duracion, Serie serie, int totalDeVisualizaciones) {
        this.nombre = nombre;
        this.numero = numero;
        this.temporada = temporada;
        this.sinopsis = sinopsis;
        this.duracion = duracion;
        this.serie = serie;
        this.totalDeVisualizaciones = totalDeVisualizaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalDeVisualizaciones > 100){
            return 5;
        }else {
            return  2;
        }
    }

    @Override
    public String toString() {
        return """
                📚 Temporada %d | 📙Capitulo %d
                📺 Titulo: %s 
                📝 Sinopsis: %s
                🕐 Duracion: %d minutos
                👀 Visualizaciones: %s visualizaciones
                """.formatted(temporada, numero, nombre,sinopsis,duracion,totalDeVisualizaciones);
    }
}
