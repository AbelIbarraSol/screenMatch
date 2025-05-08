package com.strangecorp.screenmatch.principal;
import com.strangecorp.screenmatch.models.Pelicula;
import com.strangecorp.screenmatch.models.Serie;
import com.strangecorp.screenmatch.models.Titulo;

import java.util.*;

public class PrincipalList {
    public static void main(String[] args) {
        var flow = new Pelicula("Openhaimer", 2024);
        flow.agregarNota(6.0);
        var lMvsM = new Pelicula("Los Mitchell vs. las Máquinas", 2021);
        lMvsM.agregarNota(6.5);
        var parasitos = new Pelicula("Parásitos", 2019);
        parasitos.agregarNota(8.9);
        var theGodFather = new Pelicula("El Padrino", 1972);
        theGodFather.agregarNota(10.0);

        var serie1 = new Serie("The Walking Dead",2010);
        serie1.agregarNota(6.4);

        List<Titulo> lista = new ArrayList<>();
        lista.add(flow);
        lista.add(lMvsM);
        lista.add(parasitos);
        lista.add(serie1);

        lista.forEach(item -> {
            System.out.println("Nombre: "+item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>=3){
                System.out.println("Clasificacion: "+pelicula.getClasificacion()+"\n----------------------");
            }else System.out.println("Clasificacion menor a 3 estrellas"+"\n----------------------");
        });

        //Ordenando Listas
        List<String> nombreActores = new ArrayList<>();
        nombreActores.add("Ricardo Darin");
        nombreActores.add("Tom Cruise");
        nombreActores.add("Jonny Deep");
        Collections.sort(nombreActores);
        System.out.println("Lista ordenada de actores: "+nombreActores);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada: "+lista);

        lista.sort(Comparator.comparing(Titulo::getLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);
    }
}
