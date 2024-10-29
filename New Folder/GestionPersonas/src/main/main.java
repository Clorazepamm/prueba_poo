package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
/**
 *
 * @author Cetecom
 */
public class main {
    public static void main(string[] args){
        Arraylist<Persona> personas = arraylist();
        
        Empleado empleado1 = new Empleado("juan",30,50000) {
            @Override
            public void EjecutarOperacion() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    Cliente cliente1 = new Cliente("ana",25,"premium");
    
    personas.add(empleado1);
    personas.add(cliente1);
    
  
    for (var persona : personas){
        persona.mostrarInformacion();
        persona.EjecutarOperacion();
        System.out.println(".........");
    }
    }
//</editor-fold>
//</editor-fold>
    public static void Arraylist<Persona> mainylist() {
        Arraylist<Persona> personas = new arraylist<>();
    }

    private static class arraylist {

        public arraylist() {
        }
    }
}

