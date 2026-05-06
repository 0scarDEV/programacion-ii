package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class UsandoLambdas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("uno");      
        lista.add("dos");
        lista.add("tres");

        /* Tarea 1 */
        lista.forEach(s -> System.out.println(s));


        /* Tarea 2 */
        AtomicInteger longitudTotal = new AtomicInteger(0);
        int[] longitudTotalArray = {0};
        List<String> losDeTamañoMayorA3 = new ArrayList<>();
        lista.forEach(s -> {
            if (s.length() > 3) {
                losDeTamañoMayorA3.add(s);
            }
            longitudTotal.set(longitudTotal.get() + s.length());
            longitudTotalArray[0] += s.length();
        });

        // AtomicInteger funciona por ser un Objeto mutable.
        System.out.println("Longitud total: " + longitudTotal.get());
        
        // El array funciona porque el array es un objeto mutable, aunque el array en sí no se modifique, su contenido sí puede ser modificado.
        System.out.println("Longitud total (array): " + longitudTotalArray[0]);


        /* Tarea 3 */
        Consumer<String> imprimir = s -> System.out.println(s.length());
        lista.forEach(imprimir);
    }
}