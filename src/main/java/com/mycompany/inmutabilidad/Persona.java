package com.mycompany.inmutabilidad;

public class Persona {
    private final String identificacion;
    private final String nombre;
    private int edad;
    private Genero genero;
    
    /**
     * @param identificacion
     * @param nombre
     * @param edad
     * @param genero
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Persona(String identificacion, String nombre, int edad, Genero genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    /**
     * 
     * @return String identificación
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * 
     * @return String nombre
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return int edad
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @return Genero género
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * 
     * @param genero
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setGenero(Genero genero) {
        if(edad >= 18) {
            this.genero = genero;
        }
    }
}
