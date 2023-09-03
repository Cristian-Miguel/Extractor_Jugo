/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author crist
 */
public class Tamano_Contenedor {
    private List<ArrayList> tamanos = new ArrayList<>(){
        {
            add(new ArrayList<>(){{ add("Pequeño"); add(250); }});
            add(new ArrayList<>(){{ add("Mediano"); add(400); }});
            add(new ArrayList<>(){{ add("Grande"); add(600); }});
        }
    };

    public List<ArrayList> getTamanos() {
        return tamanos;
    }
    
    public String [] getArray_Tamano(){
        String array_tamano [] = new String[tamanos.size()];
        int i = 0;
        for (Iterator<ArrayList> iterator = tamanos.iterator(); iterator.hasNext();) {
            ArrayList next = iterator.next();
            array_tamano[i] = (String) next.get(0);
            i++;
        }
        return array_tamano;
    }
    
    public int getTamano_Actual(int posicion_tamano){
//        List prop_tamano = tamanos.get(posicion_tamano);
        return (int) tamanos.get(posicion_tamano).get(1);
    }
}
