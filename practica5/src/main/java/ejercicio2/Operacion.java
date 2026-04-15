package ejercicio2;
import java.time.LocalDate;

public interface Operacion {
    String visualizarMenu();
    void ejecutar();
}

// Operación Saludar
class OperacionSaludar implements Operacion {
    public String visualizarMenu() { return "Saludar"; }
    public void ejecutar() { System.out.println("¡Hola! Bienvenido al programa."); }
}

// Operación Fecha
class OperacionFecha implements Operacion {
    public String visualizarMenu() { return "¿Qué día es hoy?"; }
    public void ejecutar() { System.out.println("Hoy es: " + LocalDate.now()); }
}

// Nueva operación solicitada: Chiste
class OperacionChiste implements Operacion {
    public String visualizarMenu() { return "Decir chiste"; }
    public void ejecutar() {
        System.out.println("¿Qué le dice un GIF a un JPG? ¡Anímate, hombre!");
    }
}