package acciones;

import enumeradores.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {

    private AlmacenAlimentos comida;

    public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota) {
        if (mascota.isIsLive()) {
            mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
            mascota.setNivelHambre(mascota.getNivelHambre() - comida.getDisminuyeHambre());
            contabilizarComida(mascota);
            if (mascota.getPopo().tieneQueEvacuar(mascota)) {
                mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
                Morir.chequeoGeneral(mascota);
                if (mascota.isIsLive()) {
                    System.out.println("La mascota necesita ir a baño");
                }

            } else {
                System.out.println("lo siento esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
            }
        }
    }

    public void contabilizarComida(Mascota mascota) {
        mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);

    }

}
