/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Gladis
 */
public class DukeMascota extends Mascota{
    
    public DukeMascota(String nombre, String propietario) {
        super(nombre, propietario);
        
        
    }

    @Override
    public String toString() {
        return "La mascota de nombre :" +nombre+'\n'
                + "nacio el dia " + fechaNacimiento.getDayOfWeek() + " ,"
                                  + fechaNacimiento.getDayOfMonth() + " de "
                                  + fechaNacimiento.getMonth() + " del año "
                                  + fechaNacimiento.getYear() + '\n'
                + "a la hora: "   + fechaNacimiento.getHour() +":"
                                  + fechaNacimiento.getMinute() + '\n'
                + "actualmente se encuentra " +((isLive) ? "vivo\n" : "muerto\n")
                + "su nivel de energia se encuentra en: "+nivelEnergia +"%\n"
                + "el nivel de hambre en:" +nivelHambre+'\n'
                +"el nivel de cansancio en:"+ nivelCansancio+'\n'
                +"el nivel de felicidad: "+ nivelFelicidad+ '\n'
                +"nivel aburrimiento: "+ nivelAburrimiento+ '\n'
                + "y su actual propietario es: "+propietario +'\n';
                
                }
    
}
