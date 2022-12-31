package Enumeradores;

public enum Entretenimientos {

    lolcito(10), Pasear(20), mirarElTecho(1), musica(5);

    private int actividad;
    Entretenimientos(int actividadElegida) {
        this.actividad = actividadElegida;
    }
    public int getActividad() {
        return actividad;
    }
}
