
package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author VAIO
 */
public class ListExemplo {
    
    public static void main(String[] args) {
       
        List <String> nomes = new ArrayList<>();
        
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("Joao");
        
        nomes.set(2,"Larissa");
        System.out.println(nomes);
        
        Collections.sort(nomes);
        
        System.out.println(nomes);
        
        nomes.remove(4);
        System.out.println(nomes);
        
        nomes.remove("Carlos");
        System.out.println(nomes);
        
        String nome = nomes.get(2);
        
        System.out.println(nome);
        
        int tamanho = nomes.size();
        
        boolean temMaria = nomes.contains("Maria");
        
        int posicao = nomes.indexOf("Maria");
        
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
        
        for(String nomeDoItem: nomes){
            System.out.println("->>" + nomeDoItem);
        }
        
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("--->>>" + iterator.next());
        }
        nomes.clear();
        
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
        
      
    }
    
}