package com.strangecorp.screenmatch.calculations;

import com.strangecorp.screenmatch.models.Titulo;

public class TiempoDeVisualizacion{
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setDuracionTitulo(Titulo titulo){
        this.tiempoTotal += titulo.getDuracion();
    }

}
