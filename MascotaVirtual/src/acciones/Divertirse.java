
package acciones;

import enumeradores.EntretenimientosEnum;
import modelos.Mascota;

public class Divertirse {
    
    public void entretenerseCon(EntretenimientosEnum entretenimiento,Mascota mascota){
        if(mascota.isIsLive()){
            int nivelOriginal=mascota.getNivelAburrimiento();
            if(nivelOriginal!=0){
                mascota.setNivelAburrimiento(mascota.getNivelAburrimiento()-entretenimiento.getDesaburrimiento());
                System.out.println("duke acaba de entretenerse con "+entretenimiento
                  + " y su aburrimiento que estaba en "+nivelOriginal
                        +" descendio a "+mascota.getNivelAburrimiento());
                
            }else{
                System.out.println("esta mascota no esta aburrida");
            }
            
        }else{
            System.out.println("lo siento esta mascota no esta activa desde "+mascota.getFechaMuerte());
        }
    }
    
}
