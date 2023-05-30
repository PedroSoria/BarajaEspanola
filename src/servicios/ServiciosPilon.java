package servicios;

import entidades.Pilon;

public class ServiciosPilon {
    
    Pilon pilon = new Pilon();
    
    public void cartasPilon() {
        System.out.println(pilon.getPilon().toString());
    }
}
