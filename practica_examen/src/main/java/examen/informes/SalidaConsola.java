package examen.informes;

public class SalidaConsola implements Salida {

    @Override
    public void escribir(String texto) {
        System.out.println(texto);
    }

}
