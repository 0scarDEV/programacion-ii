package examen.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Predicate;

// Tests a escribir por el alumno:
//
// Ejercicio 2:
//   - Test que compruebe que se puede crear una Biblioteca, añadirle bibliotecarios
//     de distintos tipos y que el número de bibliotecarios es correcto.
//   - Test que compruebe que getTotalHoras() devuelve la suma correcta de las
//     horas máximas de todos los bibliotecarios de la biblioteca.
//
// Ejercicio 4:
//   - Test llamado testGetTotalHorasSoloBibliotecarioAuxiliar que compruebe que
//     getTotalHoras(Predicate<Bibliotecario>) devuelve la suma correcta de horas
//     cuando se filtra solo por los bibliotecarios que son BibliotecarioAuxiliar.

public class BibliotecaTest {
    @Test
    public void testGetNombre() {
        Biblioteca b = new Biblioteca("Biblioteca Central");
        assertEquals("Biblioteca Central", b.getNombre());
    }

    @Test
    public void testNumBibliotecarios() {
        Biblioteca b1 = new Biblioteca("Two-Person Library");
        BibliotecarioJefe bJ = new BibliotecarioJefe("Maria", "mary@tpl.uk", false);
        b1.añadirBibliotecario(bJ);
        BibliotecarioAuxiliar bA1 = new BibliotecarioAuxiliar("Pepe", "pepe@tpl.uk", false);
        b1.añadirBibliotecario(bA1);

        assertEquals(2, b1.getNumBibliotecarios());

        Biblioteca b2 = new Biblioteca("Three-Person Library");
        BibliotecarioAuxiliar bA2 = new BibliotecarioAuxiliar("Josefa", "josepha@tpl.uk", true);
        b2.añadirBibliotecario(bJ);
        b2.añadirBibliotecario(bA1);
        b2.añadirBibliotecario(bA2);

        assertEquals(3, b2.getNumBibliotecarios());
    }

    @Test
    public void testNumHorasTotal() {
        Biblioteca b = new Biblioteca("Two-Person Library");
        BibliotecarioJefe bJ = new BibliotecarioJefe("Maria", "mary@tpl.uk", false);
        b.añadirBibliotecario(bJ);
        BibliotecarioAuxiliar bA1 = new BibliotecarioAuxiliar("Pepe", "pepe@tpl.uk", true);
        b.añadirBibliotecario(bA1);

        assertEquals(1600+1700, b.getTotalHoras());
    }

    @Test
    public void testGetTotalHorasSoloBibliotecarioAuxiliar() {
        Biblioteca biblio = new Biblioteca("Two-Person Library");
        BibliotecarioJefe bJ = new BibliotecarioJefe("Maria", "mary@tpl.uk", false);
        biblio.añadirBibliotecario(bJ);
        BibliotecarioAuxiliar bA1 = new BibliotecarioAuxiliar("Pepe", "pepe@tpl.uk", true);
        BibliotecarioAuxiliar bA2 = new BibliotecarioAuxiliar("Josefa", "josepha@tpl.uk", false);
        biblio.añadirBibliotecario(bA1);
        biblio.añadirBibliotecario(bA2);

        Predicate<Bibliotecario> filtro = (b -> b instanceof BibliotecarioAuxiliar);
        assertEquals(1700+1500, biblio.getTotalHoras(filtro));
    }
}
