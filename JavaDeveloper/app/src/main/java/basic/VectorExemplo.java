
package basic;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author VAIO
 */
public class VectorExemplo {
    
    public static void main(String[] args) {
        
        List <String> esportes = new Vector<>();
        
        //Adicionar
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");
        
        //altera
        esportes.set(2,"Ping pong");
        
        //remove
        esportes.remove(2);
        
        //remova
        esportes.remove("Handebol");
        
        //retorna
        System.out.println(esportes.get(0));
        
        //navega
        for(String esporte: esportes){
            System.out.println(esporte);
        }
    }
    
}
