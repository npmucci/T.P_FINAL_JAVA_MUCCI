package Acciones;

import Enumeradores.EntretenimientosEnum;
import modelos.Mascota;

public class Divertirse {
    public void entretenerseCon(EntretenimientosEnum entretenimiento, Mascota mascota) {
        if(mascota.isLive()){
            int nivelOriginal = mascota.getNivelAburrimiento();
            if(nivelOriginal != 0) {
                mascota.setNivelAburrimiento(mascota.getNivelAburrimiento() - entretenimiento.getDesaburrimiento());
                System.out.println("Tu mascota acaba de entretenerse con "
                        + entretenimiento
                        + " y su aburrimiento que estaba en " + nivelOriginal
                        + " descendió a " + mascota.getNivelAburrimiento());
            }else{
                System.out.println("Esta mascota no tiene necesidad de entretenerse su nivel de aburrimiento es cero");
            }
            int nivelFelicidadOriginal = mascota.getNivelFelicidad();
            if (nivelFelicidadOriginal != 100) {
                mascota.setNivelFelicidad(mascota.getNivelFelicidad() + entretenimiento.getDesaburrimiento());
                System.out.println(", su nivel de felicidad  que estaba en " + nivelFelicidadOriginal
                        + " aumento a " + mascota.getNivelFelicidad());
            }
            if (mascota.isLive()){
                int nivelEnergiaOriginal = mascota.getNivelEnergia();
                if (nivelEnergiaOriginal != 0){
                    mascota.setNivelEnergia((mascota.getNivelEnergia()) - entretenimiento.getDesaburrimiento());
                    System.out.println(" y su nivel de energia que estaba en " + nivelEnergiaOriginal
                            + " descendió a " + mascota.getNivelEnergia());
                }
            }


        }else{
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
    }
}
