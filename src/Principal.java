import com.strangecorp.screenmatch.calculations.FiltroRecomendacion;
import com.strangecorp.screenmatch.models.Episodio;
import com.strangecorp.screenmatch.models.Pelicula;
import com.strangecorp.screenmatch.models.Serie;
import com.strangecorp.screenmatch.calculations.TiempoDeVisualizacion;

public class Principal {
    public static void main(String[] args) {
        Pelicula flow = new Pelicula("Flow",
                "Animada",
                "Gints Zilbalodis",
                "Letonia",
                "Sin Dialogos",
                "Un gato tendra que sobrevivir junto a otros animales una inundación en un mundo desavitado por los seres humanos",
                2024,
                80,
                true,
                true);
        flow.agregarNota(8.9);
        flow.agregarNota(9.4);
        flow.agregarNota(8.6);
        flow.agregarPremio("Oscar 2025: Mejor Pelicula Animada");
        flow.agregarPremio("Globo de Oro: Mejor Pelicula Animada");


        Serie laCasaDelDragon = new Serie(
                "La Casa del Dragón",
                "Fantasía, Drama, Acción",
                "Ryan Condal, Miguel Sapochnik",
                "Reino Unido, Estados Unidos",
                "Inglés",
                "Una precuela de Juego de Tronos que narra el auge y la caída de la Casa Targaryen, incluyendo la guerra civil conocida como la Danza de los Dragones.", // sinopsis
                2022,
                1080,
                true,
                false,
                18,
                2,
                true
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

        System.out.print(flow);
        filtroRecomendacion.filtro(flow);

        System.out.println("//////////////////////////////////////////////////////");
        System.out.print(laCasaDelDragon);
        System.out.println("------------------------------------------------------");
        System.out.print(episodio);
        filtroRecomendacion.filtro(episodio);

        System.out.println("//////////////////////////////////////////////////////");
        System.out.printf("El tiempo total que te tomara ver %s y %s es de %d minutos", flow.getNombre(), laCasaDelDragon.getNombre(), tiempoDeVisualizacion.getTiempoTotal());


    }
}
