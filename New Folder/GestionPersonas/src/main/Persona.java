/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Cetecom
 */
public abstract class  Persona implements Operaciones{
    private String nombre;
    private int Edad;
    
    public Persona(String nombre, int Edad){
        int Edad1 = this.Edad;
        
    }
    public String getnombre(){
        return nombre;
        
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public Persona(){
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    
    public abstract void mostrarInformacion();
    
 
}

