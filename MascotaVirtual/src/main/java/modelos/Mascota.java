package modelos;

import Acciones.*;
import Enumeradores.AlmacenAlimentos;
import Enumeradores.EntretenimientosEnum;
import Enumeradores.HigieneEnum;
import utils.actas.RegistroCivilMascotas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Mascota {
 // atributos de la isntancia
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
    protected  int id;
    protected Alimentarse alimentarse;
    protected Alimentarse hambre;
    protected Divertirse divertirse;
    public static LocalDateTime ultimoDescanso;
    protected Dormir descansar;
    protected int comidasIngeridas;
    protected HacerPopo popo;
    protected int nivelSuciedad;
    protected Higienizarce higienizarce;

    protected ArrayList<String> causaDeMuerte = new ArrayList<>();
    protected String actaDefuncion;
    protected String actaNacimiento;



    //metodo constructor
    public Mascota(String nombre,String propietario) {
        setNombre(nombre);
        setPropietario(propietario);
        setLive(true);
        setNivelEnergia(80);
        setNivelHambre((int) (Math.random() * 100));
        setNivelCansancio((int) (Math.random() * 100));
        setNivelFelicidad((int) (Math.random() * 100));
        setNivelAburrimiento((int) (Math.random() * 100));
        setFechaNacimiento(LocalDateTime.now());
        this.alimentarse = new Alimentarse();
        this.hambre = new Alimentarse();
        this.divertirse = new Divertirse();
        this.descansar = new Dormir();
        this.popo = new HacerPopo();
        setNivelSuciedad((int) (Math.random() * 100));
        this.higienizarce = new Higienizarce();
        RegistroCivilMascotas.confeccionarActa(this);
    }

// metodos de la instancia

        public void comer(AlmacenAlimentos alimento){alimentarse.ingerirAlimentos(alimento, this);};
        public void dormir(LocalTime tiempo){descansar.hacerDormir(tiempo, this);};
        public void jugar(EntretenimientosEnum entretenimientos){divertirse.entretenerseCon( entretenimientos, this);};
        public void irAlBaño(){popo.evacuar(this);}
        public void higienizarce(HigieneEnum higiene){ higienizarce.higienizarceCon(higiene, this);}
// getters

    public String getNombre() {return nombre;}

    public LocalDateTime getFechaNacimiento() {return fechaNacimiento;}
    public LocalDateTime getFechaMuerte() {return fechaMuerte;}
    public boolean isLive() {return isLive;}
    public int getNivelEnergia() {return nivelEnergia;}
    public int getNivelHambre() {return nivelHambre;}

    public int getNivelCansancio() {return nivelCansancio;}
    public int getNivelFelicidad() {return nivelFelicidad;}
    public int getNivelAburrimiento() {return nivelAburrimiento;}

    public String getPropietario() {return propietario;}

    public int getId() {return id;}

    public Alimentarse getAlimentarse() {return alimentarse;}

    public Alimentarse getHambre() {return hambre;}

    public Divertirse getDivertirse() {return divertirse;}

    public static LocalDateTime getUltimoDescanso() {return ultimoDescanso;}

    public Dormir getDescansar() {return descansar;}
    public int getComidasIngeridas() {return comidasIngeridas;}
    public HacerPopo getPopo() {return popo;}
    public int getNivelSuciedad() {return nivelSuciedad;}

    public Higienizarce getHigienizarce() {return higienizarce;}

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

    private void setId(int id) {this.id = id;}
    private void setNombre(String nombre) {this.nombre = nombre;}

    private void setFechaNacimiento(LocalDateTime fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public void setFechaMuerte(LocalDateTime fechaMuerte) { this.fechaMuerte = fechaMuerte;}
    public void setLive(boolean live) { isLive = live; }
    public void setNivelEnergia(int nivelEnergia) {this.nivelEnergia = Math.min(nivelEnergia, 100);}
    public void setNivelHambre(int nivelHambre) {this.nivelHambre = Math.min(nivelHambre, 100); }
    private void setNivelCansancio(int nivelCansancio) {this.nivelCansancio = nivelCansancio;}
    public void setNivelFelicidad(int nivelFelicidad) {this.nivelFelicidad = Math.max(nivelFelicidad, 100);}
    public void setNivelAburrimiento(int nivelAburrimiento) { this.nivelAburrimiento = Math.max(nivelAburrimiento , 0);}
    private void setPropietario(String propietario) {this.propietario = propietario;}

    public void setComidasIngeridas(int comidasIngeridas) {this.comidasIngeridas = comidasIngeridas;}

    public void setPopo(HacerPopo popo) {this.popo = popo;}

    public void setNivelSuciedad(int nivelSuciedad) {this.nivelSuciedad = nivelSuciedad;}

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





