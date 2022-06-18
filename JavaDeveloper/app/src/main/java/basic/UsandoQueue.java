
package basic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author VAIO
 */
public class UsandoQueue {
    
    public static void main(String[] args) {
       
        Queue <String> fila = new LinkedList<>();
        
        fila.add("Patrícia");
        fila.add("Roberto");
        fila.add("Flávio");
        fila.add("Paula");
        fila.add("Anderson");
        
        System.out.println(fila);
        
        String clienteASerAtendido = fila.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(fila);
        
        String primeiroCliente = fila.peek();
        
        System.out.println(primeiroCliente);
        System.out.println(fila);
        
        String primeiroClienteOuErro = fila.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(fila);
        
        for(String client: fila){
            System.out.println(client);
        }
        
        Iterator<String> iteratorFila = fila.iterator();
        
        while(iteratorFila.hasNext()){
            System.out.println("---> " + iteratorFila.next());
        }
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
    }
    
}
