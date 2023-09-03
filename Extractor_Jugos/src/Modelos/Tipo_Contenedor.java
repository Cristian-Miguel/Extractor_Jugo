/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author crist
 */
public class Tipo_Contenedor {
    private List<String> tipos = new ArrayList<>(){
        {
            add("Vaso");
            add("Bolsa");
        }
    };

    public List<String> getTipos() {
        return tipos;
    }
    
    public String[] getArray_Tipos() {
        String array_tipos [] = new String[tipos.size()];
        int i = 0;
        for (Iterator<String> iterator = tipos.iterator(); iterator.hasNext();) {
            array_tipos[i] = iterator.next();
            i++;
        }
        return array_tipos;
    }
    
}
