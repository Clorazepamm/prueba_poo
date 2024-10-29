/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Cetecom
 */
public abstract class Empleado extends Persona {
    private double salario;
    
    public Empleado(String nombre, int Edad, double salario){
        super(nombre , Edad);
        this.salario = salario;
    }
    
    public double getsalario(){
        return salario;
    }
    
    public void setsalario(double salario){
        this.salario = salario;
        
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("empleado: "+ getnombre()+",Edad: "+ getEdad()+",salario:$"+ getsalario());
        
    }
    public void ejecutarOperacion(){
        System.out.println("Realizando operacion de empleado.");
    } 

    private String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

