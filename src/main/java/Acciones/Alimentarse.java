package Acciones;

import Enumeradores.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {

    private AlmacenAlimentos comida;


    public void ingerirAlimentos(AlmacenAlimentos comida, Mascota mascota) {
        if (mascota.isEstaViva()) {
            mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
            contabilizarComida(mascota);
            if (mascota.getPopo().tieneQueEvacuar(mascota)) {
                mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
                Morir.checkStatusGeneral(mascota);
                if (mascota.isEstaViva()) {
                    System.out.println(mascota.getNombre() + " necesita ir al baño D:");
                }

            } else {
                Morir.checkStatusGeneral(mascota);
                System.out.println(mascota.getNombre() + " necesita ir al baño D:");

            }
        } else {
            Morir.checkStatusGeneral(mascota);
            System.out.println("Perdón, pero " + mascota.getNombre() + " la ripeó en: " + mascota.getFechaFallecimiento() + ". F  :c");
        }
    }
    private void contabilizarComida(Mascota mascota) {
        mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
    }
}


//            System.out.println("\n---------------------------------------------------------------------");
//
//            //            HAMBRE
//
//            if (mascota.getNivelHambre() != 0) {
//                mascota.setNivelHambre(mascota.getNivelHambre() - (50 * comida.getEnergiaAportada() / 100));
//
//                System.out.println(mascota.getNombre() + " come " + comida.toString() + " y su hambre se reduce en "
//                        + (50 * comida.getEnergiaAportada() / 100) +
//                        "%.");
//                if (mascota.getNivelHambre() < 0){
//                    mascota.setNivelHambre(0);
//                    System.out.println("Está que revienta, la gorda xd");
//                }
//                System.out.println("\nGanas de comer: " + mascota.getNivelHambre() + "%.");
//            } else {
//                System.out.println("Pobre " +
//                        mascota.getNombre() + ", ya no puede más 🤒🤢 " +
//                        "\nSi la seguís obligando a comer va a reventar como un sapo!! 🐸💥");
//            }
//
//
//            System.out.println("\n---------------------------------------------------------------------");
//
//
////            ENERGIA
//
//            if (mascota.getKi() < 100) {
//                mascota.setKi(mascota.getKi() + comida.getEnergiaAportada());
//                System.out.println("Su Ki aumenta 🦾😎");
//                if (mascota.getKi() >= 100){
//                    mascota.setKi(9001);
//                    System.out.println("It's over 9000 😱😱😱");
//                }
//                System.out.println("\nEnergía acumulada: " + mascota.getKi() + "%.");
//                    mascota.setKi(100);
//            } else {
//                mascota.setKi(100);
//                System.out.println("-y ya tiene la energía al máximo, " +
//                        "pará que va a explotar, bldx!! 😨");








