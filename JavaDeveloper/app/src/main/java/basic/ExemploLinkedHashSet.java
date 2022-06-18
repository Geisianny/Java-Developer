
package basic;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author VAIO
 */
public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
    
        //Adiciona os numenos
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        
        System.out.println(sequenciaNumerica);
        
        //Remove
        sequenciaNumerica.remove(4);
        
        System.out.println(sequenciaNumerica);
        
        //quantidade de itens
        System.out.println(sequenciaNumerica.size()+"\n");
        
        //Navega em todos os itens
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }
        
        sequenciaNumerica.clear();
        
        //retorna se set está vazia ou nao
        System.out.println(sequenciaNumerica.isEmpty());
    }
    
}
