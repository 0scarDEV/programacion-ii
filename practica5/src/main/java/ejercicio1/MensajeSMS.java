package ejercicio1;

public class MensajeSMS extends Mensaje {
    public MensajeSMS(String texto) {
        super(texto);
    }

    @Override
    public void enviar() {
        System.out.println("[SMS]  " + getTexto());
    }
}
