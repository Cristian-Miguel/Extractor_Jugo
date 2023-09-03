/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author crist
 */
public class Derrame_de_Jugo extends Exception {
    
    public Derrame_de_Jugo(String mensaje){
        super(mensaje);
    }
    
    //Esta funcion solo funcionara para generar el error y visualizar o no su contramedida
    public boolean Generar_Derrame_Jugo(){
        double error = 100*Math.random();
        return error > 70;
    }
}
