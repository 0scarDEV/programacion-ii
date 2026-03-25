package ejercicio2;

public enum TipoReserva {
    // COMPLETAR: añade la señal requerida como parámetro a cada constante
    //       y completa el constructor y el campo privado del enum
    NORMAL(0),
    GRUPO(10),
    EXCLUSIVA(50);

    // COMPLETAR: declara un campo privado double para la señal requerida
    private double senhalRequerida;

    // COMPLETAR: declara el constructor del enum que reciba la señal requerida
    private TipoReserva(double senhalRequerida) {
        this.senhalRequerida = senhalRequerida;
    }

    // NORMAL -> 0.0, GRUPO -> 10.0, EXCLUSIVA -> 50.0
    public double getSenalRequerida() {
        return this.senhalRequerida;
    }
}
