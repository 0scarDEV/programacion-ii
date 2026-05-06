package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class UsandoLambdas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("uno");      
        lista.add("dos");
        lista.add("tres");

        lista.forEach(s -> System.out.println(s));
    }
}