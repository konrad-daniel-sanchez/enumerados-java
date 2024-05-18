package com.mycompany.inmutabilidad;

public class Principal {
    
    /**
     * Método inicial que será llamado para toda la aplicación
     * @param args 
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Persona homero = new Persona("1234","Homero Simpson", 34, Genero.MASCULINO);
        
        //homero.nombre = "Lisa";
        
        System.out.println("El objeto homero tiene los siguientes valores:");
        System.out.println("identificación: " + homero.getIdentificacion());
        System.out.println("Nombre: " + homero.getNombre());
        System.out.println("Edad: " + homero.getEdad());
        
        if(homero.getGenero() == Genero.MASCULINO){
            System.out.println("Homero es masculino");
        }
        
        System.out.println("Los siguientes son todos los géneros disponibles:");
        Genero[] generosDisponibles = Genero.values();
        for(int i=0; i<generosDisponibles.length; i++){
            System.out.println(generosDisponibles[i]);
        }        
    }
}
