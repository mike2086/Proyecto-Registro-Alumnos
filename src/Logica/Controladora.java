
package Logica;


public class Controladora {
    
    Alumno vectorAlu[] = new Alumno[4];
    
    public void agregarAlumno(String dni, String nombre, String apellido){
       
        //crear alumnos
        Alumno alum = new Alumno();
        
        //seteo Datos
        alum.setNombre(nombre);
        alum.setApellido(apellido);
        //convertor un string en entero
        int dniNumero = Integer.parseInt(dni);
        alum.setDNI(dniNumero);
        
        
        for (int i=0; i<vectorAlu.length; i++ ){
        //condicion para guardar alumnos en una posocion vacia e inmediatamente sale del bucle
            if(vectorAlu[i] == null){
            vectorAlu[i] = alum;
            i = 4;
            }
            
        }
        
        for( int i = 0; i < vectorAlu.length; i++){
            if (vectorAlu[i] != null){
            System.out.println(" alumno en la posicion :" + i + ": " + vectorAlu[i].getNombre());
            }
        }
    }
    
  
    public Alumno traerAlumno(int indice) {
    
        return vectorAlu[indice];
    }
        
}
