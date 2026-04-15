package ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class PruebaNotificacionesIfElseMain {
    public static void main(String[] args) {

        List<Mensaje> mensajes = new ArrayList<>();

        mensajes.add(new Mensaje(TipoNotificacion.EMAIL,
                "Este es el contenido del email."));

        mensajes.add(new Mensaje(TipoNotificacion.SMS,
                "Este es el contenido del SMS."));

        mensajes.add(new Mensaje(TipoNotificacion.APP,
                "Este es el contenido de la notificación de la app."));

        for (Mensaje mensaje : mensajes) {
            // Cada mensaje lleva un prefijo distinto
            if (mensaje.getTipo() == TipoNotificacion.EMAIL) {
                System.out.println("[Email] " + mensaje.getTexto());
            } else if (mensaje.getTipo() == TipoNotificacion.SMS) {
                System.out.println("[SMS] " + mensaje.getTexto());
            } else if (mensaje.getTipo() == TipoNotificacion.APP) {
                System.out.println("[App] " + mensaje.getTexto());
            }
        }
    }
}