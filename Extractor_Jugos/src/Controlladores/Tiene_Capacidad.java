package Controlladores;

import Excepciones.Derrame_de_Jugo;
import Modelos.Frutas_Verduras;
import Modelos.Tamano_Contenedor;
import java.util.List;

/**
 *
 * @author crist
 */
public class Tiene_Capacidad extends Frutas_Verduras{
    
    public int Llenar(int posicion, int tipo_tamano, int cantidad_llenado){
        Tamano_Contenedor lista_tamano = new Tamano_Contenedor();
        int cantidad_porcion = 0;
        try {
            cantidad_porcion = getCantidad_Por_Porcion(posicion);
            int total_lleno = cantidad_llenado + cantidad_porcion;
            if(total_lleno > lista_tamano.getTamano_Actual(tipo_tamano)){
                throw new Derrame_de_Jugo("Se derramo el jugo");
            }else{
              return total_lleno;  
            }
        } catch (Derrame_de_Jugo e) {
            boolean error = e.Generar_Derrame_Jugo();
            if(error)
                return lista_tamano.getTamano_Actual(tipo_tamano);
            else
                return cantidad_llenado + cantidad_porcion;
        }
    }
      
}
