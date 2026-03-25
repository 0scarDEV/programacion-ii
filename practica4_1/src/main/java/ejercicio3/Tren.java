package ejercicio3;

public class Tren {
    private int cvPotencia;
    private Vagon primerVagon;

    public Tren(int cvPotencia, Vagon primerVagon) {
        this.cvPotencia = cvPotencia;
        this.primerVagon = primerVagon;
    }

    public int getCvPotencia() {
        return cvPotencia;
    }

    public void setCvPotencia(int cvPotencia) {
        this.cvPotencia = cvPotencia;
    }

    public Vagon getPrimerVagon() {
        return primerVagon;
    }

    public void setPrimerVagon(Vagon primerVagon) {
        this.primerVagon = primerVagon;
    }

    public int getNumVagones() {
        if (primerVagon == null) {
            return 0;
        }
        return 1 + primerVagon.cuantosMeSiguen();
    }
}
