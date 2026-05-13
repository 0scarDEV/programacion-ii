package examen.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Biblioteca {
    private String nombre;
    // Ejercicio 1: añadir el campo necesario para implementar la relación con Bibliotecario
    private List<Bibliotecario> bibliotecarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        // Ejercicio 1: inicializar el campo
        bibliotecarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Ejercicio 1: implementar este método
    public void añadirBibliotecario(Bibliotecario b) {
        bibliotecarios.add(b);
    }

    // Ejercicio 1: implementar estos métodos de acceso por posición
    public int getNumBibliotecarios() {
        return bibliotecarios.size();
    }

    public Bibliotecario getBibliotecario(int pos) {
        return bibliotecarios.get(pos);
    }

    // Ejercicio 2: implementar este método usando polimorfismo.
    // Biblioteca no debe conocer el tipo concreto de cada bibliotecario.
    public int getTotalHoras() {
        int totalHoras = 0;
        for (Bibliotecario b : bibliotecarios) {
            totalHoras += b.getHorasMaximas();
        }
        return totalHoras;
    }

    // Ejercicio 4: implementar este método. Debe usar el método forEach
    // del campo de bibliotecarios para recorrerlos.
    public int getTotalHoras(Predicate<Bibliotecario> filtro) {
        AtomicInteger totalHoras = new AtomicInteger(0);

        bibliotecarios.forEach(b -> {
            if (filtro.test(b)) { // totalHoras.addAndGet(b.getHorasMaximas()); } // Otra opción sin usar .get() y .set() como pide el enunciado
                totalHoras.set(totalHoras.get() + b.getHorasMaximas());
            }
        });

        return totalHoras.get();
    }
}
