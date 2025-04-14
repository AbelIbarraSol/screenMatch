package com.strangecorp.screenmatch.models;

public class Serie extends Titulo {
    private int  cantidadDeEpisodios, cantidadDeTemporadas;
    private boolean enEmision;

    public Serie(String nombre, String genero, String director, String pais, String idioma, String sinopsis, int lanzamiento, int duracion, boolean incluidoEnElPlan, boolean postCreditos, int cantidadDeEpisodios, int cantidadDeTemporadas, boolean enEmision) {
        super(nombre, genero, director, pais, idioma, sinopsis, lanzamiento, duracion, incluidoEnElPlan, postCreditos);
        this.cantidadDeEpisodios = cantidadDeEpisodios;
        this.cantidadDeTemporadas = cantidadDeTemporadas;
        this.enEmision = enEmision;
    }

    public int getCantidadDeEpisodios() {
        return cantidadDeEpisodios;
    }

    public void setCantidadDeEpisodios(int cantidadDeEpisodios) {
        if (cantidadDeEpisodios <= 0){
            System.out.println("La cantidad de episodios no puede ser menor o igual a 0");
        }
        this.cantidadDeEpisodios = cantidadDeEpisodios;
    }

    public int getCantidadDeTemporadas() {
        return cantidadDeTemporadas;
    }

    public void setCantidadDeTemporadas(int cantidadDeTemporadas) {
        if (cantidadDeTemporadas <= 0){
            System.out.println("La cantidad de temporadas no puede ser menor o igual a 0");
        }
        this.cantidadDeTemporadas = cantidadDeTemporadas;
    }

    public boolean isEnEmision() {
        return enEmision;
    }

    public void setEnEmision(boolean enEmision) {
        this.enEmision = enEmision;
    }

    @Override
    public String toString() {
        return super.toString() + """
                🔢 Temporadas: %d
                🔢 Episodios: %d
                ❓  Estado: %s  
                """.formatted(cantidadDeTemporadas,
                cantidadDeEpisodios,
                enEmision? "En Emision" : "Concluido");
    }
}
