package Acciones;

import modelos.Mascota;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Mimir {

    private int horasDormidas;
    private int minutosDormidos;
    private void modificarEstado(int horasDormidas, int minutosDormidos, Mascota mascota) {
        int minutosTotales = (horasDormidas * 60) + minutosDormidos;
        mascota.setNivelEnergia(mascota.getNivelEnergia() + (minutosDormidos * 5)/10);
    }

    public void hacerDormir(LocalTime tiempoAdormir, Mascota mascota) {
        if (mascota.isEstaViva()) {

            horasDormidas = tiempoAdormir.getHour();
            minutosDormidos = tiempoAdormir.getMinute();
            modificarEstado(horasDormidas, minutosDormidos, mascota);
            mascota.ultimoDescanso = LocalDateTime.now();

        } else {
            System.out.println("Perdón, pero " + mascota.getNombre() + " la ripeó en: " + mascota.getFechaFallecimiento() + ". F  :c");
        }
    }


}



