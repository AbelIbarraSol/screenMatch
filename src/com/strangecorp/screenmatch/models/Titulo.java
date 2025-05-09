package com.strangecorp.screenmatch.models;

import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable<Titulo> {
    private String nombre, genero, director, pais, idioma, sinopsis ;
    private int lanzamiento, duracion;
    private boolean incluidoEnElPlan, postCreditos;
    private ArrayList<Double> notas = new ArrayList<>();
    private ArrayList<String> premios = new ArrayList<>();

    public Titulo(String nombre, String genero, String director, String pais, String idioma, String sinopsis, int lanzamiento, int duracion, boolean incluidoEnElPlan, boolean postCreditos) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.pais = pais;
        this.idioma = idioma;
        this.sinopsis = sinopsis;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.incluidoEnElPlan = incluidoEnElPlan;
        this.postCreditos = postCreditos;
    }

    public Titulo(String nombre, int lanzamiento) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
    }

    //MetodosGetters and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public boolean isPostCreditos() {
        return postCreditos;
    }

    public void setPostCreditos(boolean postCreditos) {
        this.postCreditos = postCreditos;
    }

    public ArrayList<String> getPremios() {
        return premios;
    }

    //Metodos especiales
    public void agregarPremio(String premio){
        premios.add(premio);
    }

    public void agregarNota(double nota){
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe de ser entre 0 y 10");
        }
        notas.add(nota);
    }

    public Double calculoDeMedia() {
        if (notas.isEmpty()){
            System.out.println("No existen puntuaciones registradas");
            return 0.0;
        }
        double suma = 0;
        for (Double nota : notas){
            suma += nota;
        }
        return suma / notas.size();
    }

    @Override
    public String toString() {
        return """
                Nombre: %s (%d)
                """.formatted(getNombre(),getLanzamiento());
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

}
