/* Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.  */
package barajaespanola;

import java.util.Scanner;
import servicios.ServiciosCarta;

public class BarajaEspanola {

    public static void main(String[] args) {

        ServiciosCarta sc = new ServiciosCarta();
        sc.cargarCartas();
        menu(sc);

    }

    public static void menu(ServiciosCarta sc) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Juego de cartas. elija una opcion:");

        System.out.println("1. Barajar");
        System.out.println("2. Siguiente carta");
        System.out.println("3. Mostrar cantidad de cartas disponibles");
        System.out.println("4. dar mano");
        System.out.println("5. Mostrar Cartas del monton");
        System.out.println("6. mostrar baraja");

        int r = scanner.nextInt();

        switch (r) {
            case 1:
                sc.barajar();
                menu(sc);
                break;
            case 2:
                System.out.println(sc.siguienteCarta());
                menu(sc);
                break;
            case 3:
                System.out.println(sc.cartasDisponibles());
                menu(sc);
                break;
            case 4:
                System.out.println(sc.darCartas(scanner.nextInt()).toString());
                menu(sc);
                break;
            case 5:
                sc.cartasMonton();
                menu(sc);
                break;
            case 6:
                sc.mostrarBaraja();
                menu(sc);
                break;
            default:
                System.out.println("Por favor introducir numero de la lista");
                menu(sc);
        }
    }
}
