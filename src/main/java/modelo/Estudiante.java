/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


// Valentina Campos ICI-I 20786053020 


/**
 *
 * @author valen
 */
public class Estudiante {
    
    //la clase se comienza asignando los nombres de las variables
    
    
    private String nombre;
    private String matricula;
    private String carrera;
    private String correo;
    
     public Estudiante(String nombre, String matricula, String carrera, String correo){
      
         
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.correo = correo;
    }
    
    public String getNombre(){return this.nombre;}    
    public String getMatricula(){return this.matricula;}
    public String getCarrera(){return this.carrera;}
    public String getCorreo(){return this.correo;}
    
    
     public void setNombre(String no){this.nombre = no;}
     public void setMatricula(String ma){this.matricula = ma;}
     public void setCarrera(String ca){this.carrera = ca;}
     public void setCorreo(String co){this.correo = co;}
     
     
     
     
}
