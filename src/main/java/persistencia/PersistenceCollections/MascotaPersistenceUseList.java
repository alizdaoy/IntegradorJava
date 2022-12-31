package persistencia.PersistenceCollections;

import persistencia.IMascotaPersistence;
import modelos.Mascota;

import java.util.List;

public class MascotaPersistenceUseList implements IMascotaPersistence {


    @Override
    public void guardar(Mascota mascota) {
        bdmascotas.add(mascota);

    }

    @Override
    public Mascota updateMascota(int id, Mascota mascota) {
        return bdmascotas.set(id, mascota);
    }

    @Override
    public Mascota getMascota(int id) {
        return bdmascotas.get(id);
    }

    @Override
    public Mascota getMascota(String nombre) {
        return null;
    }

    @Override
    public List<Mascota> getAllMascotas() {
        return bdmascotas;
    }

    @Override
    public void deleteMascota(int id) {
        bdmascotas.remove(getMascota(id));
    }

}
