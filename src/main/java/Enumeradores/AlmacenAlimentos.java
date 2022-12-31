package Enumeradores;

public enum AlmacenAlimentos {

    Sopa(10), Asadito(20), Choripan(15), Ensalada(5), pollo(10);

    private int energiaAportada;

    AlmacenAlimentos(int energia){
        this.energiaAportada = energia;
    }
    public int getEnergiaAportada() {
        return energiaAportada;
    }

}
