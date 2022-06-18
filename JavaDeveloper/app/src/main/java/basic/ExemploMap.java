
package basic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author VAIO
 */
public class ExemploMap {

    public static void main(String[] args) {
        Map<String, Integer> campeosMundialFifa = new HashMap<>();
        
        //Adiciona os campeos no mapa
        campeosMundialFifa.put("Brasil",5);
        campeosMundialFifa.put("Alemanha",4);
        campeosMundialFifa.put("Italia",4);
        campeosMundialFifa.put("Uruguai",2);
        campeosMundialFifa.put("Argentina",2);
        campeosMundialFifa.put("Franca",2);
        campeosMundialFifa.put("Inglaterra",1);
        campeosMundialFifa.put("Espanha",5);
        
        System.out.println(campeosMundialFifa);
        
        //Atualiza o valor para chavee Brasil
        campeosMundialFifa.put("Brasil",6);
        
        System.out.println(campeosMundialFifa);
        
        //retorna a Argentina
        System.out.println(campeosMundialFifa.get("Argentina"));
        
        //Retorna se existe ou nao um campeao França
        System.out.println(campeosMundialFifa.containsKey("França"));
        
        //Remove o campeao França
        campeosMundialFifa.remove("França");
        
        //Retorna se existe ou não um campeao França
        System.out.println(campeosMundialFifa.containsKey("França"));
    
        //retorna se existe ou nao alguma seleção hexa campea
        System.out.println(campeosMundialFifa.containsValue(0));
        
        //retorna o tamanho do mapa
        System.out.println(campeosMundialFifa.size());
        
        System.out.println(campeosMundialFifa);
        
        //Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : campeosMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " -- " +   entry.getValue());
            
        }
        
        // navega nos registros do mapa
        for(String key : campeosMundialFifa.keySet()){
            System.out.println(key + " -- "+ campeosMundialFifa.get(key));
        }
        
        System.out.println(campeosMundialFifa);
        
        // verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeosMundialFifa.containsKey("Estados unidos"));
    
        // verifica se o mapa contem o valor 5
        System.out.println(campeosMundialFifa.containsValue( 5));
        
        //verifica o tamanho antes e depois de limpa o mapa
        System.out.println(campeosMundialFifa.size());
        
        campeosMundialFifa.clear();
        
        System.out.println(campeosMundialFifa.size());
    
    }
    
}
