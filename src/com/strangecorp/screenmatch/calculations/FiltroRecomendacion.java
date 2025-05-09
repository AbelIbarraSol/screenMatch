package com.strangecorp.screenmatch.calculations;

public class FiltroRecomendacion {

    public void filtro (Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("#️⃣ Aclamado por la critica");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("#️⃣ Popular entre la critica");
        } else {
            System.out.println("#️⃣ Agregalo a tu lista para poder verlo luego");
        }

    }

}
