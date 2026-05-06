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

    public void setVagonSiguiente(Vagon v) {
        if (this.vagonSiguiente != null) {
            this.vagonSiguiente.vagonAnterior = null; // Desconectar el vagon siguiente actual
        }

        this.vagonSiguiente = v;
    
        if (v != null) {
            if (v.vagonAnterior != null) {
                v.vagonAnterior.vagonSiguiente = null; // Desconectar el vagon anterior del nuevo vagon
            } else {
                v.vagonAnterior = this; // Conectar el nuevo vagon siguiente
            }
        }
    }

    public int cuantosMeSiguen() {
        int count = 0;
        Vagon v = this.vagonSiguiente;
        while (v != null) {
            count++;
            v = v.vagonSiguiente;
        }
        return count;
    }
}
