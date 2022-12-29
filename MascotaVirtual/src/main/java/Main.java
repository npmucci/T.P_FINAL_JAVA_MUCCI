import Enumeradores.AlmacenAlimentos;
import Enumeradores.EntretenimientosEnum;
import modelos.*;
import persistencia.mysql.MySQLConnection;
import persistencia.persistenceCollection.MascotaPersistenceUseList;
import utils.actas.RegistroCivilMascotas;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Merlina", "Natalia");
        DukeMascota gato = new DukeMascota("Tyrion", "Andoni");
        DukeMascota hamster = new DukeMascota("Stuar", "Felipe");
        DukeMascota loro = new DukeMascota("Manolo", "Martina");
        DukeMascota perro = new DukeMascota("Hanna", "Amparo");
        DukeMascota tortuga =new DukeMascota("Manuelita", "Juana");
        DukeMascota conejo = new DukeMascota("Pompon", "Veronica");

        persistence.guardar(duke);
        persistence.guardar(gato);
        persistence.guardar(hamster);
        persistence.guardar(loro);
        persistence.guardar(perro);
        persistence.guardar(tortuga);
        persistence.guardar(conejo);


    duke.comer(AlmacenAlimentos.HELADO);
        duke.comer(AlmacenAlimentos.HELADO);
        duke.comer(AlmacenAlimentos.HELADO);
        duke.comer(AlmacenAlimentos.HELADO);
        duke.comer(AlmacenAlimentos.HELADO);
        duke.comer(AlmacenAlimentos.HELADO);


        MySQLConnection conexion = new MySQLConnection();
        Connection connection = conexion.establecerConexion();

        conexion.cerrarConexion(connection);














    }
}
