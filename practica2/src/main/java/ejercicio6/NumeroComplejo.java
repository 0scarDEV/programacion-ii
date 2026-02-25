package ejercicio6;

public class NumeroComplejo {
    double pReal;
    double pImaginaria;

    public NumeroComplejo() {
        this.pReal = 0;
        this.pImaginaria = 0;
    }

    public NumeroComplejo(double pReal) {
        this.pReal = pReal;
        this.pImaginaria = 0;
    }

    public NumeroComplejo(double pReal, double pImaginaria) {
        this.pReal = pReal;
        this.pImaginaria = pImaginaria;
    }

    public double getpReal() {
        return pReal;
    }

    public double getpImaginaria() {
        return pImaginaria;
    }

    // TODO: Continuar
}
