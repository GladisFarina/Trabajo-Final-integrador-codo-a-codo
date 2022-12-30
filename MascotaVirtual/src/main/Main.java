
package main;

import enumeradores.AlmacenAlimentos;
import java.sql.Connection;
import java.time.LocalTime;
import modelos.DukeMascota;
import persistencia.Mysql.MysqlConnection;
import persistencia.persistenceCollections.MascotaPersistenceUseList;
import utiles.RegistroCivilMascotas;


public class Main {


    public static void main(String[] args) {
        
        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();
         MysqlConnection conexion = new MysqlConnection();
         Connection connection = conexion.establecerConexion();
         conexion.cerrarConexion(connection);
        /*
        DukeMascota duke = new DukeMascota ("Duke-Lilo","Gladis");
        DukeMascota duke1 = new DukeMascota ("Duke-Roco","Fiorella");
        DukeMascota duke2 = new DukeMascota ("Duke-michi", "Luis");
        DukeMascota duke3 = new DukeMascota ("Duke-Conde", "Luciana");
        DukeMascota duke4 = new DukeMascota ("Duke-saint", "Matias");
        persistence.guardar(duke);
        persistence.guardar(duke1);
        persistence.guardar(duke2);
        persistence.guardar(duke3);
        persistence.guardar(duke4);
        
        
       
        
        duke.jugar(EntretenimientosEnum.POKER);
        duke.jugar(EntretenimientosEnum.PASEAR);
        duke.jugar(EntretenimientosEnum.PASEAR);
        duke.jugar(EntretenimientosEnum.PERINOLA);
        duke.jugar(EntretenimientosEnum.BAILAR);
*/

/*
        System.out.println("Nivel de energia antes de comer "+duke2.getNivelEnergia());
        System.out.println("nivel de hambre antes de comer "+duke2.getNivelHambre());
        duke2.comer(AlmacenAlimentos.ENSALADA);
        System.out.println("despues de comer "+duke2.getNivelEnergia());
        
        for(Mascota mascota :persistence.getAllMascotas()){
            System.out.println(mascota.getNombre());
        }

        
        System.out.println("antes de dormir "+duke.getNivelEnergia());
        duke.dormir(LocalTime.of(0, 40));
        System.out.println("despues de dormir "+duke.getNivelEnergia());

       


       
      duke.dormir(LocalTime.MIN);
      duke.comer(AlmacenAlimentos.ASADO);
      duke.comer(AlmacenAlimentos.SOPA);
      duke.comer(AlmacenAlimentos.ENSALADA);
      duke.comer(AlmacenAlimentos.CHORIPAN);
      duke.comer(AlmacenAlimentos.ASADO);
      duke.comer(AlmacenAlimentos.ASADO);
      duke.comer(AlmacenAlimentos.SOPA);
      RegistroCivilMascotas.confeccionarActa(duke);
      
      RegistroCivilMascotas.guardarActa(duke);
      
      RegistroCivilMascotas.leerActaDefuncion(duke);
  
       
    

        RegistroCivilMascotas.leerActaNacimiento(duke4);
        */
    }

    
    
}
