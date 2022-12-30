package persistencia.Mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Mascota;

public class MysqlConnection {

    final String URL = "jdbc:mysql://localhost:3306/";

    final String BD = "mascota";

    final String USERNAME = "root";

    final String PASSWORD = "root123";

    Connection connection;

    public Connection establecerConexion() {
        
        
        try {
            connection = DriverManager.getConnection(URL + BD, USERNAME, PASSWORD);

            System.out.println("La conexion con base de datos " + BD + " fue exitosa");

            ///////////////CREACION DE LA TABLA///////////////////
            
            
            String sql = "CREATE TABLE perros (" 
                    + "id INTEGER PRIMARY KEY AUTO_INCREMENT,"
                    + "nombre VARCHAR(255),"
                    + "fecha_nacimiento DATE,"
                    + "fecha_muerte DATE,"
                    + "isLive BOOLEAN,"
                    + "nivel_energia INTEGER,"
                    + "nivel_hambre INTEGER,"
                    + "nivel_cansancio INTEGER,"
                    + "nivel_felicidad INTEGER,"
                    + "nivel_aburrim INTEGER,"
                    + "comidas_ingeridas INTEGER,"
                    + "propieterio VARCHAR(255))";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.executeUpdate();
            
            
          
          //////////INSERCION DE DATOS A LA TABLA/////////////////
            
          //EL ID SE AUTO INCREMENTA POR ESO NO LO PUSE
            
            
            try {
                
            String sqlInsertar = "INSERT INTO perros ("
                    + "nombre,"
                    + "fecha_nacimiento,"
                    + "nivel_energia,"
                    + "nivel_hambre,"
                    + "nivel_cansancio,"
                    + "nivel_felicidad,"
                    + "nivel_aburrim,"
                    + "comidas_ingeridas,"
                    + "propieterio) VALUES(?,?,?,?,?,?,?,?,?)";
      PreparedStatement stmtIns = connection.prepareStatement(sqlInsertar);
            stmtIns.setString(1,"Maite");
            stmtIns.setDate(2, Date.valueOf("2022-10-11"));
            stmtIns.setBoolean(3,true);
            stmtIns.setInt(4, 80);
            stmtIns.setInt(5,40);
            stmtIns.setInt(6, 70);
            stmtIns.setInt(7, 30);
            stmtIns.setInt(8, 2);
            stmtIns.setString(9,"Gladis");
            stmtIns.executeUpdate();
            System.out.println("los datos fueron insertados correctamente");

        } catch (SQLException ex) {
      System.out.println("no se pudo insertar insertar los datos");
        }
            
             
            
            /////////MODIFICAR LOS DATOS DE LA TABLA////////////
            
            
            
            try{
                
            String sqlModificar = "UPDATE perros SET nombre = ?, propieterio = ? WHERE id = ?";
            PreparedStatement stmtModificar = connection.prepareStatement(sqlModificar);
            stmtModificar.setString(1, "Ursula");
            stmtModificar.setString(2, "Marta");
            stmtModificar.setInt(3, 6);
            stmtModificar.executeUpdate();
            
            System.out.println("Los datos han sido modificados con exito");
            
            } catch (SQLException ex) {
      System.out.println("no se pudo modificar los datos");
        }
            
            
            
            
            ////////BORRAR REGISTRO DE LA TABLA///////////////
            
            try{
            String sqlBorrar = "DELETE FROM perros WHERE id = ?";
            PreparedStatement stmtBorrar = connection.prepareStatement(sqlBorrar);
            stmtBorrar.setInt(1,2);
            stmtBorrar.executeUpdate();
            
            System.out.println("Los datos han sido eliminados con exito");  
            
            } catch (SQLException ex) {
      System.out.println("no se pudo eliminar los datos");
        }
            

        } catch (SQLException e) {
            System.out.println("No se pudo establecer la conexion con la base de datos");
            e.printStackTrace();

        }
        return connection;
    }

    public void cerrarConexion(Connection connection) {
        try {
            connection.close();
            System.out.println("La conexion a la base de datos " + BD + " fue cerrada con exito");
        } catch (SQLException e) {
            System.out.println("No se ha podido cerrar la conexion a la base de datos");
            e.printStackTrace();
        }
    }

    public PreparedStatement consultarBD(Connection connection, String consultaSQL) {
        try {
            return connection.prepareStatement(consultaSQL);
        } catch (SQLException e) {
            System.out.println("No se ha podido generar el objeto PreparedStatement");
            e.printStackTrace();
        }
        return null;
    }

    private MascotaPersistenceUseMySQL MascotaPersistenceUseMySQL() {
        return null;
    }
}
