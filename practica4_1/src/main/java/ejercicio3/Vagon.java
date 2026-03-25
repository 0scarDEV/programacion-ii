package ejercicio3;

public class Vagon {
    private Vagon vagonAnterior;
    private Vagon vagonSiguiente;

    public Vagon(Vagon vagonAnterior, Vagon vagonSiguiente) {
        this.vagonAnterior = vagonAnterior;
        this.vagonSiguiente = vagonSiguiente;
    }

    public Vagon getVagonAnterior() {
        return vagonAnterior;
    }

    public Vagon getVagonSiguiente() {
        return vagonSiguiente;
    }

    public void setVagonSiguiente(Vagon vagonSiguiente) {
        if (this.vagonSiguiente != null) {
            this.vagonSiguiente.vagonAnterior = null; // Desconectar el vagon siguiente actual
        }
        this.vagonSiguiente = vagonSiguiente;
    }
}
