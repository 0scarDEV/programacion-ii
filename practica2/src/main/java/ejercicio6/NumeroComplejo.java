package ejercicio6;

public class NumeroComplejo {
    double pReal;
    double pImaginaria;

    public NumeroComplejo() {
        this(0,0);
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

    public static NumeroComplejo suma(NumeroComplejo a, NumeroComplejo b) {
        return new NumeroComplejo(a.getpReal() + b.getpReal(), a.getpImaginaria() + b.getpImaginaria());
    }

    public static NumeroComplejo multiplicacion(NumeroComplejo c, double d){
        return new NumeroComplejo(c.getpReal() * d, c.getpImaginaria() * d);
    }

    public NumeroComplejo getAbsValue() {
        double absReal = Math.abs(this.pReal);
        double absImaginaria = Math.abs(this.pImaginaria);
        return new NumeroComplejo(absReal, absImaginaria);
    }
}
