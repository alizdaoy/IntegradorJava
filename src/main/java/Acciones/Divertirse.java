package Acciones;

import Enumeradores.Entretenimientos;
import modelos.Mascota;

public class Divertirse {

    private Entretenimientos entretenimientos;

    public void divertirseCon (Entretenimientos entretenimientos, Mascota mascota){
        if(mascota.isEstaViva()){
            mascota.setNivelAburrimiento(mascota.getNivelAburrimiento() - entretenimientos.getActividad());

            if (mascota.getNivelAburrimiento()<0){
                mascota.setNivelAburrimiento(0);
                System.out.println("Ya llegó al límite de la diversión, papi." +
                        " Ya está, basta de tanta mascotita y agarrá la pala, hermano!! >:v");
            }
            else {
                System.out.println(mascota.getNombre() +
                        " se está divirtiendo con " +
                        entretenimientos.getActividad() +
                        " y su nivel de aburrimiento es: " +
                        mascota.getNivelAburrimiento() + "%. :)");
            }
        }
        else {
            System.out.println("Perdón, pero " +
                    mascota.getNombre() + " murió en: " +
                    mascota.getFechaFallecimiento() + ". F :c");
        }
    }

}
