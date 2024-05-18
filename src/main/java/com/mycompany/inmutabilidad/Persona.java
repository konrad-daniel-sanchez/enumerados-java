package com.mycompany.inmutabilidad;

public class Persona {
    private final String identificacion;
    private final String nombre;
    private int edad;
    private Genero genero;
    
    public Persona(String identificacion, String nombre, int edad, Genero genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        if(edad >= 18){
            this.genero = genero;
        }
    }
    
    
    
    
}
