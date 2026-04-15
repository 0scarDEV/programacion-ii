package ejercicio1;

public class MensajeApp extends Mensaje {
    public MensajeApp(String texto) {
        super(texto);
    }

    @Override
    public void enviar() {
        System.out.println("[App] " + getTexto());
    }
}