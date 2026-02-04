package ejercicio2;

public class CorreoElectronico {
    String nombre;
    String apellidos;
    String usuario;
    String servidor;

    public CorreoElectronico(String nombre, String apellidos, String usuario, String servidor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.servidor = servidor;
    }

    public CorreoElectronico(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = apellidos.split(" ")[0].toLowerCase() + nombre.toLowerCase().charAt(0);
        this.servidor = "esei.uvigo.es";
    }

    @Override
    public String toString() {
        return apellidos + ", " + nombre + ": " + usuario + "@" + servidor;
    }
}