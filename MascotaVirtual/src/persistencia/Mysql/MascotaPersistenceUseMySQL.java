package persistencia.Mysql;

import java.sql.Connection;
import java.util.List;
import modelos.Mascota;
import persistencia.IMascotaPersistence;

public class MascotaPersistenceUseMySQL implements IMascotaPersistence {

    MysqlConnection mySQLConnection;
    Connection connection;

    public MascotaPersistenceUseMySQL() {
        this.mySQLConnection = new MysqlConnection();
        this.connection = mySQLConnection.establecerConexion();
    }

    @Override
    public void guardar(Mascota mascota) {
        
    }

    @Override
    public Mascota getMascota(int id) {
        return null;
        
    }

    @Override
    public Mascota getMascota(String nombre) {
        return null;
        
    }

    @Override
    public List<Mascota> getAllMascotas() {
        return null;
        
    }

    @Override
    public void updateMascota(int id, Mascota mascota) {
        
    }

    @Override
    public void deletedMascota(int id) {
    }

    

}
