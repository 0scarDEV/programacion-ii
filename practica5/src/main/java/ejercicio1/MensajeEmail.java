package ejercicio1;

public class MensajeEmail extends Mensaje {
    public MensajeEmail(String texto) {
        super(texto);
    }

    @Override
    public void enviar() {
        System.out.println("[Email] " + getTexto());
    }
}
