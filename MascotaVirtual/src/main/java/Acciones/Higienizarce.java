package Acciones;

import Enumeradores.EntretenimientosEnum;
import Enumeradores.HigieneEnum;
import modelos.Mascota;

public class Higienizarce {

    public void higienizarceCon(HigieneEnum higiene, Mascota mascota) {
        if(mascota.isLive()){
            int nivelSuciedadOriginal = mascota.getNivelSuciedad();
            if(nivelSuciedadOriginal != 0) {
                mascota.setNivelSuciedad(mascota.getNivelSuciedad() - higiene.getHigiene());
                System.out.println("Tu mascota acaba de  "
                        + higiene
                        + " y su nivel de suciedad  que estaba en " + nivelSuciedadOriginal
                        + " desendió a " + mascota.getNivelAburrimiento());
            }else{
                System.out.println("Esta mascota no tiene necesidad de higienizarse, está limpia");
            }
            if (mascota.getPopo().tieneQueEvacuar(mascota)) {
                mascota.setNivelSuciedad(mascota.getNivelSuciedad() - 15);
                System.out.println("Esta mascota tiene que higienizarse");

            }

        }else{
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
    }
}
