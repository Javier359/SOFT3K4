package domain;

public class Pais {
<<<<<<< HEAD
    
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
=======
    private final String nombre;
    private final String codigoIso;

    public Pais(String nombre, String codigoIso) {
        this.nombre = nombre;
        this.codigoIso = codigoIso;
>>>>>>> pais-origen
    }

    public String getNombre() {
        return nombre;
    }
<<<<<<< HEAD
    
    
=======

    public String getCodigoIso() {
        return codigoIso;
    }
>>>>>>> pais-origen
}
