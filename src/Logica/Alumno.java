
package Logica;


public class Alumno {
    
    int DNI;
    String Nombre;
    String Apellido;

    public Alumno() {
    }

    public Alumno(int DNI, String Nombre, String Apellido) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
    
}
