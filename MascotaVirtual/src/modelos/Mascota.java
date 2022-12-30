package modelos;

import acciones.Alimentarse;
import acciones.Divertirse;
import acciones.Dormir;
import acciones.HacerPopo;
import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Mascota {
    protected int id;
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
    protected LocalDateTime fechaMuerte;
    protected boolean isLive;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected int nivelCansancio;
    protected int nivelFelicidad;
    protected int nivelAburrimiento;
    protected String propietario;
    protected Alimentarse alimentarse;
    protected Divertirse divertirse;
    public static LocalDateTime ultimoDescanso;
    protected Dormir descansar;
    protected int comidasIngeridas;
    protected HacerPopo popo;
    protected ArrayList<String> causaDeMuerte = new ArrayList<>();
    protected String actaDefuncion;
    protected String actaNacimiento;
    
//metodo constructor mascota
    public Mascota(String nombre, String propietario) {
        setNombre(nombre);
        setPropietario(propietario);
        setComidasIngeridas(comidasIngeridas);
        setIsLive(true);
        setNivelEnergia((int) (Math.random() * 100));
        setNivelHambre((int) (Math.random() * 100));
        setNivelCansancio((int) (Math.random() * 100));
        setNivelFelicidad((int) (Math.random() * 100));
        setNivelAburrimiento((int) (Math.random() * 100));
        setFechaNacimiento(LocalDateTime.now());
        this.alimentarse = new Alimentarse();
        this.divertirse = new Divertirse();
        this.descansar = new Dormir();
        this.popo = new HacerPopo();
    }

    public void comer(AlmacenAlimentos alimento) {
        alimentarse.ingerirAlimento(alimento, this);
    }

    ;
    public void dormir(LocalTime tiempo) {
        descansar.hacerDormir(tiempo, this);
    }

    ;
    
    public void jugar(EntretenimientosEnum entretenimiento) {
        divertirse.entretenerseCon(entretenimiento, this);
    }

    ;
    
    public void irAlBaño() {
        popo.evacuar(this);
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDateTime getFechaMuerte() {
        return fechaMuerte;
    }

    public boolean isIsLive() {
        return isLive;
    }

    public int getNivelEnergia() {
        return Math.min(nivelEnergia, 100);
    }

    public int getNivelHambre() {
        return Math.max(nivelHambre, 0);
    }

    public int getNivelCansancio() {
        return nivelCansancio;
    }

    public int getNivelFelicidad() {
        return nivelFelicidad;
    }

    public int getNivelAburrimiento() {
        return Math.max(nivelAburrimiento, 0);
    }

    public String getPropietario() {
        return propietario;
    }

    public int getComidasIngeridas() {
        return comidasIngeridas;
    }

    public ArrayList<String> getCausaDeMuerte() {
        return causaDeMuerte;
    }

    public String getActaDefuncion() {
        return actaDefuncion;
    }

    public String getActaNacimiento() {
        return actaNacimiento;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    
 
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaMuerte(LocalDateTime fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
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

    private void setNivelFelicidad(int nivelFelicidad) {
        this.nivelFelicidad = nivelFelicidad;
    }

    public void setNivelAburrimiento(int nivelAburrimiento) {
        this.nivelAburrimiento = nivelAburrimiento;
    }

    private void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    private void setcomidasIngeridas(int comidasIngeridas) {
        this.comidasIngeridas = comidasIngeridas;
        
    }
    
    public void setComidasIngeridas(int i) {
         this.comidasIngeridas = comidasIngeridas;
        
    }

    public HacerPopo getPopo() {
        return popo;
    }


    public void setCausaDeMuerte(String causaDeMuerte) {
        this.causaDeMuerte.add(causaDeMuerte);
    }

    public void setActaDefuncion(String actaDefuncion) {
        this.actaDefuncion = actaDefuncion;
    }

    public void setActaNacimiento(String actaNacimiento) {
        this.actaNacimiento = actaNacimiento;
    }

    
    
    
    

}
