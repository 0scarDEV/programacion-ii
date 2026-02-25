package ejercicio6;

public class NumeroComplejo {
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
}
