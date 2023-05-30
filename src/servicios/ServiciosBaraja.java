package servicios;

import entidades.Baraja;
import entidades.Carta;
import entidades.Pilon;
import java.util.ArrayList;
import java.util.Collections;



public class ServiciosBaraja {

    Pilon pilon = new Pilon();
    Baraja baraja = new Baraja();
    int posicion = 39;

    
    
    public void barajar() { 
        Collections.shuffle(baraja.getBaraja());
    }

    public void cargarCartas() {
        int j = 1;
        for (int i = 0; i < 40; i = i + 4) {

            if ( j == 8) { 
                j = 10;
            }
            baraja.setUnaCarta(new Carta(j, "Oro"));
            baraja.setUnaCarta(new Carta(j, "Oro"));
            baraja.setUnaCarta(new Carta(j, "Basto"));
            baraja.setUnaCarta(new Carta(j, "Espada"));
            baraja.setUnaCarta(new Carta(j, "Copa"));
            
            j++;
        }
    }
    
    
    public Carta siguienteCarta() { 
        pilon.setUnaCarta(baraja.getBaraja().get(posicion));
        return baraja.getBaraja().remove(posicion --);
    }

    
    public int cartasDisponibles() {
        return (posicion + 1);
    }
    

    public ArrayList<Carta> darCartas(int n) {
        
        ArrayList<Carta> mano = new ArrayList();
        
        if (n <= posicion) {
            for (int i = 0; i < n; i++) {
            mano.add(baraja.getBaraja().get(posicion));
            posicion --;
        }
        pilon.getPilon().addAll(mano);
        } 
        return mano;
    }

 //lo pase al servicio de pilon   
//    public void cartasMonton() {
//        System.out.println(monton.toString());
//    }

    public void mostrarBaraja() {
        for (int i = 0; i < posicion + 1; i++) {
            System.out.println(baraja.getBaraja().get(i));
        }
    } 
    
}
