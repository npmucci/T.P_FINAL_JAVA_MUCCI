package modelos;

public class DukeMascota extends Mascota {

    private static int count;
    public DukeMascota(String nombre, String propietario) {
        super(nombre, propietario);
        this.id = count++;

    }
 //metodo to string
 @Override

 public String toString(){
        return "La Mascota de nombre : " +nombre+ '\n'
                + "numero " + id + '\n'
                + "nació el día " + fechaNacimiento.getDayOfWeek() + ", "
                                  + fechaNacimiento.getDayOfMonth() + " de "
                                  + fechaNacimiento.getMonth() + " del año "
                                  + fechaNacimiento.getYear() + '\n'
                + "a la hora "     + fechaNacimiento.getHour() + ":"
                                  + fechaNacimiento.getMinute() + '\n'
                + "Actualmente se encuentra " + ((isLive) ? "vivo\n" : "muerto\n")
                + "Su nivel de Energia se encuentra en: " + nivelEnergia + "\n"
                + "Su nivel de Hambre en: " + nivelHambre + "\n"
                + "El nivel de Cansancio en: " + nivelCansancio + "\n"
                + "El nivel de Felicidad en: " + nivelFelicidad + "\n"
                + "El nivel de Aburrimento en: " + nivelAburrimiento + "\n"
                + "y su actual propietario es: " + propietario + "\n";

 }

}
