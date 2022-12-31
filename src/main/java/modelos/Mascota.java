package modelos;

import Acciones.Alimentarse;
import Acciones.Divertirse;
import Acciones.HacerPopo;
import Acciones.Mimir;
import Enumeradores.AlmacenAlimentos;
import Enumeradores.Entretenimientos;
import Utils.RegistroCivilMascotas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Mascota {


    //Atributos
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
    protected LocalDateTime fechaFallecimiento;
    protected boolean estaViva;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected int nivelCansancio;
    protected int nivelFelicidad;
    protected int nivelAburrimiento;
    protected String propietarix;
    protected int Id;
    protected Alimentarse alimentarse;
    protected AlmacenAlimentos almacenAlimentos;
    protected Divertirse divertirse;
    protected Entretenimientos entretenimientos;
    protected Mimir mimir;
    public static LocalDateTime ultimoDescanso;
    protected int comidasIngeridas;
    protected HacerPopo popo;
    protected ArrayList<String> causaDeMuerte = new ArrayList();
    protected String actaDefuncion;
    protected String actaNacimiento;



    //Constructores
    public Mascota(String nombre, String propietario){
        setNombre(nombre);
        setPropietarix(propietario);
        setEstaViva(true);
        setNivelAburrimiento((int)(Math.random()*100));
        setNivelCansancio(((int)(Math.random()*100)));
        setNivelFelicidad(((int)(Math.random()*100)));
        setNivelHambre(((int)(Math.random()*100)));
        setNivelEnergia(((int)(Math.random()*100)));
        setFechaNacimiento(LocalDateTime.now());
        setId(Id++);
        this.alimentarse = new Alimentarse();
        this.divertirse = new Divertirse();
        this.mimir = new Mimir();
        this.popo = new HacerPopo();
        RegistroCivilMascotas.confeccionarActa(this);

    }


    //Metodos de la instancia

//    Comer
    public void comer(AlmacenAlimentos almacenAlimentos) {
        alimentarse.ingerirAlimentos(almacenAlimentos, this);
    }
//    Diversión
    public void divertirse(Entretenimientos entretenimientos){
        divertirse.divertirseCon(entretenimientos,this);
    };
//    Mimir
    public void mimir(LocalTime tiempo){
        mimir.hacerDormir(tiempo,this);
    };
//    Baño
    public void irAlBaño(){
        popo.evacuar(this);
    }


//    Getters


    public String getActaDefuncion() {
        return actaDefuncion;
    }

    public String getActaNacimiento() {
        return actaNacimiento;
    }

    public ArrayList<String> getCausaDeMuerte() {
        return causaDeMuerte;
    }
    public HacerPopo getPopo() {
        return popo;
    }

    public int getComidasIngeridas() {
        return comidasIngeridas;
    }

    public Entretenimientos getEntretenimientos() {
        return entretenimientos;
    }

    public Divertirse getDivertirse() {
        return divertirse;
    }

    public AlmacenAlimentos getAlmacenAlimentos() {
        return almacenAlimentos;
    }

    public Alimentarse getAlimentarse() {
        return alimentarse;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDateTime getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    public boolean isEstaViva() {
        return estaViva;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public int getNivelCansancio() {
        return nivelCansancio;
    }

    public int getNivelFelicidad() {
        return nivelFelicidad;
    }

    public int getNivelAburrimiento() {
        return nivelAburrimiento;
    }

    public String getPropietarix() {
        return propietarix;
    }



//    Setters


    public void setActaDefuncion(String actaDefuncion) {
        this.actaDefuncion = actaDefuncion;
    }

    public void setActaNacimiento(String actaNacimiento) {
        this.actaNacimiento = actaNacimiento;
    }

    public void setCausaDeMuerte(String causaDeMuerte) {
        this.causaDeMuerte.add(causaDeMuerte);
    }

    public void setComidasIngeridas(int comidasIngeridas) {
        this.comidasIngeridas = comidasIngeridas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaFallecimiento(LocalDateTime fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }

    public void setEstaViva(boolean estaViva) {
        this.estaViva = estaViva;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }

    private void setNivelCansancio(int nivelCansancio) {
        this.nivelCansancio = nivelCansancio;
    }

    public void setNivelFelicidad(int nivelFelicidad) {
        this.nivelFelicidad = nivelFelicidad;
        Math.min(0,100);
    }

    public void setNivelAburrimiento(int nivelAburrimiento) {
        this.nivelAburrimiento = nivelAburrimiento;
    }

    private void setPropietarix(String propietarix) {
        this.propietarix = propietarix;
    }

    public void setId(int id) {
        Id = id;
    }

}
