 
package basic;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author VAIO
 */
public class ExercicioFila {

    public static void main(String[] args) {
        
        Queue <String> fila = new LinkedList<>();
        
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("Joao");
        
        for(String nome: fila){
            System.out.println(nome);
        }
        
        String primeiroFila = fila.peek();
        System.out.println("\n" + primeiroFila);
        System.out.println("\n" + fila);
         
        String primeiroRemovidoFila = fila.poll();
        System.out.println("\n" + primeiroRemovidoFila);
        
        System.out.println("\n" + fila);
        
        fila.add("Daniel");
        String novoNome = fila.element();
        
        System.out.println(novoNome);
        
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        
        
        boolean temCarlos = fila.contains("Carlos");
        System.out.println(temCarlos);
    }
    
}
