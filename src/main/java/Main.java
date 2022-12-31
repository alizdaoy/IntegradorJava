import Enumeradores.AlmacenAlimentos;
import Mascotas.UniMascota;
import Utils.RegistroCivilMascotas;
import modelos.Mascota;
import persistencia.PersistenceCollections.MascotaPersistenceUseList;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        MascotaPersistenceUseList persistance = new MascotaPersistenceUseList();
        Mascota uniMascota = new UniMascota("Uni","Lu");

        persistance.guardar(uniMascota);

        uniMascota.comer(AlmacenAlimentos.Asadito);
        uniMascota.comer(AlmacenAlimentos.Asadito);
        uniMascota.comer(AlmacenAlimentos.Asadito);
        uniMascota.comer(AlmacenAlimentos.Asadito);
        uniMascota.comer(AlmacenAlimentos.Asadito);
        uniMascota.comer(AlmacenAlimentos.Asadito);
        uniMascota.comer(AlmacenAlimentos.Asadito);
        uniMascota.comer(AlmacenAlimentos.Asadito);
        RegistroCivilMascotas.guardarActa(uniMascota);


//        uniMascota.comer(AlmacenAlimentos.Asadito);

//        System.out.println(uniMascota.getNivelEnergia());
//        uniMascota.mimir(LocalTime.of(15,50));
//        System.out.println(uniMascota.getNivelEnergia());

//        uniMascota.divertirse(Entretenimientos.lolcito);
//
//
//        System.out.println("\n---------------------------------------------------------------------\n");
//
//        System.out.println("La felicidad inicial es: " + uniMascota.getNivelFelicidad());
//        System.out.println("El aburrimiento es: " + uniMascota.getNivelAburrimiento());
//
//
//        System.out.println("\n---------------------------------------------------------------------\n");

























    }
}
