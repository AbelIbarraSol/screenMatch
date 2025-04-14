import java.util.Arrays;

public class Pelicula {
    String nombre, pais, direccion, genero;
    int lanzamiento, duracion;
    boolean incluidoEnElPlan;
    private double [] nota = new double[3];
    double clasificacion;

    private int indice = 0;

    void fichaTecnica(){
        System.out.println("Título: "+nombre);
        System.out.println("Dirección: "+direccion);
        System.out.println("Duración: "+duracion);
        System.out.println("Año: "+lanzamiento);
        System.out.println("País: "+pais);
        System.out.println("Genero: "+genero);
    }

    void agregarNotas(double valor){
        try {

            if (indice <= nota.length) {
                nota[indice] = valor;
                System.out.print("Nota " + (indice + 1) + ": ");
                System.out.println(nota[indice]);
                indice++;
            }
        } catch(Exception e){
                System.out.println("ERROR: El array esta lleno");
        }
    }

    void promedioNotas(){
        clasificacion = (Arrays.stream(nota).sum()/Arrays.stream(nota).count());
        System.out.printf("Clasificacion %.2f estrellas",clasificacion);
    }


}
