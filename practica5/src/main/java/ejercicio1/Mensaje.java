package ejercicio1;

abstract class Mensaje {
    private String texto;

    public String getTexto() {
        return texto;
    }

    /* Tarea 1 */
    /*
    private TipoNotificacion tipo;

    public Mensaje(TipoNotificacion tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
    }

    public TipoNotificacion getTipo() {
        return tipo;
    }
    */

    /* Tarea 2 */
    public Mensaje(String texto) {
        this.texto = texto;
    }

    public abstract void enviar();    
}