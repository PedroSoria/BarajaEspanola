
package entidades;

import java.util.ArrayList;

public class Pilon {

    
    //Atributes
    ArrayList<Carta> pilon;

    
    //Constructor
    public Pilon() {
        this.pilon = new ArrayList();
    }

    public Pilon(ArrayList<Carta> pilon) {
        this.pilon = pilon;
    }
    
    
    //Getter Setter
    public ArrayList<Carta> getPilon() {
        return pilon;
    }

    public void setPilon(ArrayList<Carta> pilon) {
        this.pilon = pilon;
    }
    
    public void setUnaCarta(Carta carta) {
        pilon.add(carta);
    }

    @Override
    public String toString() {
        return "ServiciosBaraja{" + "monton=" + pilon + '}';
    }
}
