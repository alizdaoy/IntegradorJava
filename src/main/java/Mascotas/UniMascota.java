package Mascotas;

import modelos.Mascota;

public class UniMascota extends Mascota {


    public UniMascota(String nombre, String propietarix) {
        super(nombre, propietarix);
    }
    private static int count;{
        count=Id;
    }
    @Override

    public String toString(){
        return "El nombre de la mascota es: " + getNombre() + ".\n" +
                "Nació el día " + fechaNacimiento.getDayOfWeek() + ", de"
                                + fechaNacimiento.getMonth() + " de "
                                + fechaNacimiento.getYear() + ".\n"
                + "Actualmente está " + ((estaViva) ? "viva\n" : "muerta\n")
                + "Su nivel de energía es: " + nivelEnergia + "%\n"
                + "Carga una lija de: " + nivelHambre + "%\n"
                + "Ganas de mimir: " + nivelCansancio + "%\n"
                + "Es " + nivelFelicidad + " % feliz.\n"
                + "Y su nivel de aburrimiento es de: " + nivelAburrimiento + "%.\n"
                + "Su propietarix es: " + propietarix + ".\n"
                + "Su Id es: " + count++ + ".";
    }



}
