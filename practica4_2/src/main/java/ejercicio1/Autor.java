package ejercicio1;

public class Autor {
    private String orcid;
    private String apellidos;
    private String nombre;
    private String institucion;
    
    public Autor(String orcid, String apellidos, String nombre, String institucion) {
        this.orcid = orcid;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.institucion = institucion;
    }

    public String getOrcid() {
        return orcid;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstitucion() {
        return institucion;
    }
}
