import com.strangecorp.screenmatch.calculations.FiltroRecomendacion;
import com.strangecorp.screenmatch.models.Episodio;
import com.strangecorp.screenmatch.models.Pelicula;
import com.strangecorp.screenmatch.models.Serie;
import com.strangecorp.screenmatch.calculations.TiempoDeVisualizacion;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        var flow = new Pelicula("Flow",
                "Animada","Gints Zilbalodis",
                "Letonia","Sin Dialogos",
                "Un gato tendra que sobrevivir junto a otros animales una inundación en un mundo desavitado por los seres humanos",
                2024,80,
                true,true);
        flow.agregarNota(8.9);
        flow.agregarNota(9.4);
        flow.agregarNota(8.6);
        flow.agregarPremio("Oscar 2025: Mejor Pelicula Animada");
        flow.agregarPremio("Globo de Oro: Mejor Pelicula Animada");

        var lMvsM = new Pelicula("Los Mitchell vs. las Máquinas",
                "Animación, Ciencia ficción, Comedia, Aventura","Mike Rianda",
                "Estados Unidos","Inglés",
                "Una familia disfuncional se embarca en un viaje por carretera, pero su aventura se ve interrumpida por una rebelión de robots. Ahora, los Mitchell son la última esperanza de la humanidad.",
                2021, 110,
                true, false);
        lMvsM.agregarNota(9.5);
        lMvsM.agregarNota(7.4);
        lMvsM.agregarNota(6.7);
        lMvsM.agregarPremio("Premio Annie 2022: Mejor Película Animada");
        lMvsM.agregarPremio("Critics Choice Award 2021: Mejor Largometraje Animado");

        var parasitos = new Pelicula("Parásitos",
                "Drama, Suspenso", "Bong Joon-ho",
                "Corea del Sur", "Coreano",
                "Una familia de clase baja se infiltra en la vida de una familia adinerada, desencadenando una serie de eventos inesperados que exponen las desigualdades sociales.",
                2019, 132,
                true, false);
        parasitos.agregarNota(9.5);
        parasitos.agregarNota(8.4);
        parasitos.agregarNota(8.7);
        parasitos.agregarPremio("Óscar 2020: Mejor Película");
        parasitos.agregarPremio("Palma de Oro en el Festival de Cannes 2019");


        listaDePeliculas.add(flow);
        listaDePeliculas.add(lMvsM);
        listaDePeliculas.add(parasitos);


        System.out.println(listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.size());
        System.out.println(listaDePeliculas);
/*
        Serie laCasaDelDragon = new Serie(
                "La Casa del Dragón","Fantasía, Drama, Acción",
                "Ryan Condal, Miguel Sapochnik","Reino Unido, Estados Unidos",
                "Inglés",
                "Una precuela de Juego de Tronos que narra el auge y la caída de la Casa Targaryen, incluyendo la guerra civil conocida como la Danza de los Dragones.", // sinopsis
                2022,
                1080,true,
                false,18,
                2,true
        );

        laCasaDelDragon.agregarNota(9.9);
        laCasaDelDragon.agregarNota(9.4);
        laCasaDelDragon.agregarNota(10.0);
        laCasaDelDragon.agregarPremio("Globo de Oro 2023");
        laCasaDelDragon.agregarPremio("Premios Emmy 2023");

        Episodio episodio = new Episodio(
                "Los Herederos Del Dragon",
                1,
                1,
                "Viserys prepara un torneo para celebrar el nacimiento de su segundo hijo. Rhaenyra le da la bienvenida a su tío Daemon cuando vuelve a la Fortaleza Roja.",
                62,
                laCasaDelDragon,
                500);

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        TiempoDeVisualizacion tiempoDeVisualizacion = new TiempoDeVisualizacion();
        tiempoDeVisualizacion.setDuracionTitulo(flow);
        tiempoDeVisualizacion.setDuracionTitulo(laCasaDelDragon);



        System.out.println("//////////////////////////////////////////////////////");
        System.out.print(laCasaDelDragon);
        System.out.println("------------------------------------------------------");
        System.out.print(episodio);
        filtroRecomendacion.filtro(episodio);

        System.out.println("//////////////////////////////////////////////////////");
        System.out.printf("El tiempo total que te tomara ver %s y %s es de %d minutos", flow.getNombre(), laCasaDelDragon.getNombre(), tiempoDeVisualizacion.getTiempoTotal());
*/


    }
}
