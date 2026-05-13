package examen.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void añadirProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public int getNumeroProfesores() {
        return profesores.size();
    }

    public Profesor getProfesor(int index) {
        if (index >= 0 && index < profesores.size()) {
            return profesores.get(index);
        }
        return null; // o lanzar una excepción
    }

    public int getTotalHoras() {
        int totalHoras = 0;
        for (Profesor profesor : profesores) {
            totalHoras += profesor.getHorasMaximas();
        }
        return totalHoras;
    }

    public int getTotalHoras(Predicate<Profesor> filtro) {
        AtomicInteger totalHoras = new AtomicInteger(0);

        profesores.forEach(
            profesor -> {
                if (filtro.test(profesor)) {
                    totalHoras.addAndGet(profesor.getHorasMaximas());
                }
            }
        );

        return totalHoras.get();
    }
}
