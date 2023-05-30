package entidades;

import java.util.ArrayList;

public class Baraja {
        
    
    //Atributes
    ArrayList<Carta> baraja;

    
    //Constructor
    public Baraja() {
        this.baraja = new ArrayList();
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    
    //Getter Setter
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public void setUnaCarta(Carta carta) {
        baraja.add(carta);
    }

    @Override
    public String toString() {
        return "ServiciosBaraja{" + "monton=" + baraja + '}';
    }
}
