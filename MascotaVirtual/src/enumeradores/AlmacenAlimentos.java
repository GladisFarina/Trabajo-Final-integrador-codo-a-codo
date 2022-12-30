
package enumeradores;


public enum AlmacenAlimentos {
    SOPA(15,15), ASADO(25,25), CHORIPAN(10,10), ENSALADA(20,20);
    
    private int energiaAportada;
    private int disminuyeHambre;
    
    AlmacenAlimentos(int energia,int hambre){
        this.energiaAportada=energia;
        this.disminuyeHambre=hambre;
    }
    public int getEnergiaAportada(){
        return energiaAportada;
    }
    public int getDisminuyeHambre(){
        return disminuyeHambre;
    }
}
