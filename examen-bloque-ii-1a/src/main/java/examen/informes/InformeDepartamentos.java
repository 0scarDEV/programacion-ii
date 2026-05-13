package examen.informes;

import java.io.IOException;
import java.util.List;

import examen.base.Departamento;
import examen.base.Profesor;

public class InformeDepartamentos {
    private List<Departamento> departamentos;
    
    public InformeDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void generarInforme(Salida salida) {
        StringBuilder sb = new StringBuilder();
        for (Departamento departamento : departamentos) {
            sb.append("Departamento: ").append(departamento.getNombre()).append("\n");
            for (int i = 0; i < departamento.getNumeroProfesores(); i++) {
                Profesor p = departamento.getProfesor(i);
                sb.append(p.toString()).append("\n");
            }
            sb.append("Total horas máximas: ").append(departamento.getTotalHoras()).append("\n");
            sb.append("\n");
        }

        try {
            salida.escribir(sb.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
