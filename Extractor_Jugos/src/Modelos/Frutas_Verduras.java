package Modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author crist
 */
public class Frutas_Verduras {
    
    private List<ArrayList> sabor_caracteristicas = new ArrayList<>(){
        {
            //sabor - cantidad_total - ml_por_porcion - cantidad_restante 3000
            add(new ArrayList<>(){{ add("Zanahoria"); add(3000); add(3); add(403); }});
            add(new ArrayList<>(){{ add("Pepino");    add(5000); add(5); add(5000); }});
            add(new ArrayList<>(){{ add("Manzana");   add(7000); add(7); add(7000); }});
            add(new ArrayList<>(){{ add("Pera");      add(6000); add(6); add(6000); }});
        }
    };
    
    public int getCantidad_Total(int posicion){
        List lista = sabor_caracteristicas.get(posicion);
        int cantidad_total = (int) lista.get(1);
        return cantidad_total;
    }
    
    public List<String> getSabores(){
        List<String> sabores = new ArrayList<>();
        for (Iterator<ArrayList> iterator = sabor_caracteristicas.iterator(); iterator.hasNext();) {
            ArrayList next = iterator.next();
            String sabor = (String) next.get(0);
            sabores.add(sabor);
        }
        return sabores;
    }
    
    public String [] getArreglo_Sabores(){
        String array_sabores [] = new String[sabor_caracteristicas.size()];
        int i = 0;
        for (Iterator<ArrayList> iterator = sabor_caracteristicas.iterator(); iterator.hasNext();) {
            ArrayList next = iterator.next();
            array_sabores[i] = (String) next.get(0);
            i++;
        }
        return array_sabores;
    }
    
    public int getCantidad_Por_Porcion(int posicion){
        List lista = sabor_caracteristicas.get(posicion);
        int cantidad_por_porcion = (int) lista.get(2);
        return cantidad_por_porcion;
    }
    
    public int getCantidad_Restante(int posicion){
        List lista = sabor_caracteristicas.get(posicion);
        int cantidad_restante = (int) lista.get(3);
        return cantidad_restante;
    }
    
    public void setCantidad_Restante(int posicion, int quitar_cantidad){
        List lista = sabor_caracteristicas.get(posicion);
        int cantidad_restante = (int) lista.get(3);
        int cantidad_actual = cantidad_restante - quitar_cantidad;
        lista.set(3, cantidad_actual);
        sabor_caracteristicas.set(posicion, (ArrayList) lista);
    }
    
    
}
