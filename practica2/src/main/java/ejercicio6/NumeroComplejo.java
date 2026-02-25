package ejercicio6;

public class NumeroComplejo {
    public static final NumeroComplejo CERO = new NumeroComplejo(0, 0);
    public static final NumeroComplejo UNO = new NumeroComplejo(1, 0);
    public static final NumeroComplejo I = new NumeroComplejo(0, 1);
    double[] componentes = new double[2];
    //double pReal;
    //double pImaginaria;

    public NumeroComplejo() {
        this(0,0);
    }

    public NumeroComplejo(double pReal, double pImaginaria) {
        //this.pReal = pReal;
        //this.pImaginaria = pImaginaria;
        this.componentes[0] = pReal;
        this.componentes[1] = pImaginaria;
    }

    public double getpReal() {
        //return pReal;
        return componentes[0];
    }

    public double getpImaginaria() {
        //return pImaginaria;
        return componentes[1];
    }

    public static NumeroComplejo suma(NumeroComplejo a, NumeroComplejo b) {
        return new NumeroComplejo(a.getpReal() + b.getpReal(), a.getpImaginaria() + b.getpImaginaria());
    }

    public static NumeroComplejo multiplicacion(NumeroComplejo c, double d){
        return new NumeroComplejo(c.getpReal() * d, c.getpImaginaria() * d);
    }

    public NumeroComplejo getAbsValue() {
        //double absReal = Math.abs(this.pReal);
        //double absImaginaria = Math.abs(this.pImaginaria);
        double absReal = Math.abs(this.componentes[0]);
        double absImaginaria = Math.abs(this.componentes[1]);
        return new NumeroComplejo(absReal, absImaginaria);
    }

    public static NumeroComplejo real(double r) {
        return new NumeroComplejo(r, 0);
    }
    
     public static NumeroComplejo imaginario(double i) {
        return new NumeroComplejo(0, i);
    }
}
