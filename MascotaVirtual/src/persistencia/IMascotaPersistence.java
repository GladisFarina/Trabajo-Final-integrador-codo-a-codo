/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import modelos.Mascota;

/**
 *
 * @author Gladis
 */
public interface IMascotaPersistence {
    List<Mascota> bdMascotas =new ArrayList<>();
    void guardar(Mascota mascota);
    Mascota getMascota(int id);
    Mascota getMascota(String nombre);
    List<Mascota> getAllMascotas();
    void updateMascota (int id,Mascota mascota);
    void deletedMascota(int id);
    
}
