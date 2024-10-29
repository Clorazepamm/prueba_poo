/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Cetecom
 */
public class Cliente extends Persona {

    private final String tipoMembresia;
    
    public Cliente(String nombre,int Edad,String tipoMembresia){
        super(nombre,Edad);
        this.tipoMembresia = tipoMembresia;
        
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }
    
    public void settipoMembresia(String tipoMembresia){
        this.tipoMembresia = tipoMembresia;
    }
    
    /**
     *
     */
    @Override
    public void mostrarInformacion() {
        boolean gettipoMembresia = false;
        System.out.println("Cliente: " + getnombre() + ",Edad: " + getEdad() +"membresia: "+ gettipoMembresia );
    }

    public Cliente() {
        this.tipoMembresia = null;
    }
    
    
    public void ejecutarOperacion(){
        System.out.println("realizando operacion de cliente. ");
    }

    private String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
