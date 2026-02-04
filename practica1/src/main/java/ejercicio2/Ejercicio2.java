package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        CorreoElectronico correoSimple = new CorreoElectronico("Juan", "Pérez Santos");
        System.out.println("El correo formado por un nombre y un apellido es: " + correoSimple);
        CorreoElectronico correoCompleto = new CorreoElectronico("Ana", "García López", "agarcia", "gmail.com");
        System.out.println("El correo formado por nombre, apellidos, usuario y servidor es: " + correoCompleto);
    }
}


