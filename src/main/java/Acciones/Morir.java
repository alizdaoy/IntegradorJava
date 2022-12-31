package Acciones;

import modelos.Mascota;

import java.time.LocalDateTime;

public class Morir {
    public static void checkStatusGeneral(Mascota mascota){
        if (mascota.getNivelEnergia() == 0){
            mascota.setEstaViva(false);
            mascota.setFechaFallecimiento(LocalDateTime.now());
            if (mascota.getCausaDeMuerte().isEmpty()) {
                determinarCausaDeMuerte(mascota);
            }
            System.out.println("Esta mascota ha fallecido en la fecha " + mascota.getFechaFallecimiento().toLocalDate());
            System.out.println("La causa de muerte fue :" + (mascota.getCausaDeMuerte()));
        }
    }

    private static void determinarCausaDeMuerte(Mascota mascota) {
        if (mascota.getNivelAburrimiento() == 100) {
            mascota.setCausaDeMuerte("Aburrimiento");
        }
        if (mascota.getNivelHambre() == 100) {
            mascota.setCausaDeMuerte("Hambre");
        }
        if (mascota.getNivelCansancio() == 100) {
            mascota.setCausaDeMuerte("Cansancio");
        }
        if (mascota.getNivelFelicidad() == 0) {
            mascota.setCausaDeMuerte("Tristeza");
        }
        if (mascota.getComidasIngeridas() > 4) {
            mascota.setCausaDeMuerte("Constipado");
        }
    }
}

