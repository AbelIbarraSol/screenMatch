import com.strangecorp.screenmatch.models.Pelicula;
import com.strangecorp.screenmatch.models.Serie;
import com.strangecorp.screenmatch.calculators.TiempoDeVisualizacion;

public class Principal {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Flow",
                "Animada",
                "Gints Zilbalodis",
                "Letonia",
                "Mudo",
                "Un gato tendra que sobrevivir junto a otros animales una inundación en un mundo desavitado por los seres humanos",
                2024,
                80,
                true,
                true);
        p1.agregarNota(7.9);
        p1.agregarNota(3.4);
        p1.agregarNota(5.6);
        p1.agregarPremio("Oscar 2025: Mejor Pelicula Animada");
        p1.agregarPremio("Globo de Oro: Mejor Pelicula Animada");

        Serie s1 = new Serie(
                "Breaking Bad",
                "Drama criminal, Suspenso, Humor negro",
                "Vince Gilligan",
                "Estados Unidos",
                "Inglés",
                "Walter White, un profesor de química, se convierte en fabricante de metanfetaminas tras ser diagnosticado con cáncer de pulmón inoperable.",
                2008,
                47,
                true,
                false,
                62,
                5,
                false);
        s1.agregarNota(9.9);
        s1.agregarNota(9.4);
        s1.agregarNota(10.0);
        s1.agregarPremio("Globo de Oro");
        s1.agregarPremio("Premios Emmy");

        System.out.println(p1);
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(s1);

        TiempoDeVisualizacion tiempoDeVisualizacion = new TiempoDeVisualizacion();
        tiempoDeVisualizacion.setDuracionTitulo(p1);
        tiempoDeVisualizacion.setDuracionTitulo(s1);

        System.out.printf("El tiempo total que te tomara ver %s y %s es de %d minutos", p1.getNombre(), s1.getNombre(), tiempoDeVisualizacion.getTiempoTotal());

    }
}
