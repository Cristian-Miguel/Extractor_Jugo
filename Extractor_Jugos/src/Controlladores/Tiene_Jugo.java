package Controlladores;

import Excepciones.Jugo_Insuficiente;
import Modelos.Frutas_Verduras;
import Modelos.Tamano_Contenedor;

/**
 *
 * @author crist
 */
public class Tiene_Jugo extends Frutas_Verduras{
    
    public boolean Checar_Stock_General(int posicion){
        try {
            int cantidad_actual = getCantidad_Restante(posicion);
            if(cantidad_actual < 250)
                throw new Jugo_Insuficiente("No hay jugo");
            else
                return false;
        } catch (Jugo_Insuficiente e) {
           return true; 
        }
    }
    
    public boolean Checar_Stock_Tamano(int posicion, int tipo_tamano){
        try {
            Tamano_Contenedor lista_tamano = new Tamano_Contenedor();
            int tamano = lista_tamano.getTamano_Actual(tipo_tamano);
            int cantidad_actual = getCantidad_Restante(posicion);
            if(tamano > cantidad_actual)
                throw new Jugo_Insuficiente("No hay jugo para el contenedor");
            else
                return false;
        } catch (Jugo_Insuficiente e) {
            return true;
        }
    }
}
