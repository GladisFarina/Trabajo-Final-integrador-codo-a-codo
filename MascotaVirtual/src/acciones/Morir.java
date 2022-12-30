
package acciones;

import java.time.LocalDateTime;
import modelos.Mascota;


public class Morir {
    
    public static void chequeoGeneral(Mascota mascota){
        if(mascota.getNivelEnergia()==0){
            mascota.setIsLive(false);
            mascota.setFechaMuerte(LocalDateTime.now());
            determinarCausaDeMuerte(mascota);
        }
        System.out.println("Esta mascota ha fallecido en la fecha "+mascota.getFechaMuerte().toLocalDate());
        System.out.println("La causa de la muerte fue "+mascota.getCausaDeMuerte());
    }
    
    public static void determinarCausaDeMuerte(Mascota mascota){
        if(mascota.getNivelAburrimiento()==100){
            mascota.setCausaDeMuerte("Aburrimiento");
        }
        if(mascota.getNivelHambre()==100){
            mascota.setCausaDeMuerte("Hambre");
        }
        if(mascota.getNivelCansancio()==100){
        mascota.setCausaDeMuerte("Cansancio");
    }
        if(mascota.getNivelFelicidad()==0){
            mascota.setCausaDeMuerte("Tristeza");
        }
        if(mascota.getComidasIngeridas()>4){
            mascota.setCausaDeMuerte("constipado");
        }
    }
    
}
