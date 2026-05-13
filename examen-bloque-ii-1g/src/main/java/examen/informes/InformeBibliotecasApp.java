package examen.informes;

import examen.base.Biblioteca;
import examen.base.BibliotecarioJefe;
import examen.base.BibliotecarioAuxiliar;

import java.io.File;
import java.util.List;

public class InformeBibliotecasApp {
    public static void main(String[] args) throws Exception {
        Biblioteca bibCentral = new Biblioteca("Biblioteca Central");
        Biblioteca bibSucursal = new Biblioteca("Biblioteca Sucursal Norte");

        // Añadir bibliotecarios cuando implementes las subclases de Bibliotecario:
        bibCentral.añadirBibliotecario(new BibliotecarioJefe("Maria", "maria@gmail.com", false));
        bibCentral.añadirBibliotecario(new BibliotecarioAuxiliar("Pepe", "pepe@gmail.com", true));
        bibSucursal.añadirBibliotecario(new BibliotecarioAuxiliar("Josefa", "josef@gmail.com", false));

        InformeBibliotecas informe = new InformeBibliotecas(List.of(bibCentral, bibSucursal));
        File fichero = new File("informe.txt");

        // 1. Escribir informe a consola (fichero = null):
        SalidaConsola sc = new SalidaConsola();
        informe.generarInforme(sc);

        // 2. Escribir informe al fichero:
        SalidaFichero sf = new SalidaFichero(fichero);
        informe.generarInforme(sf);
    }
}
