package persistencia;

import modelos.Mascota;

import java.util.ArrayList;
import java.util.List;

public interface IMascotaPersistence {

    List<Mascota> bdmascotas = new ArrayList<>();

    public void guardar(Mascota mascota);
    Mascota updateMascota(int id, Mascota mascota);
    Mascota getMascota(int id);
    Mascota getMascota(String nombre);
    List<Mascota> getAllMascotas();
    void deleteMascota(int id);

}
