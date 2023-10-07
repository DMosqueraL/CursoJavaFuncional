package InterfazComparator.Ejercicio2;

public class Persona implements Comparable<Persona>{
    private int idPersona;
    private String nombre;
    private java.util.Date fechaNacimiento;

    public Persona() {}

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.nombre);
    }

    @Override
    public String toString(){
        return String.format("persona{idPersona: %1s, nombre:%2s", idPersona, nombre);
    }
}
