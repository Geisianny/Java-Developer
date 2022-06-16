
package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author VAIO
 */
public class ListEstudantesComparator {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        
        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Flavio",19));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));
        
        System.out.println("-- ordem de insercao");
        System.out.println(estudantes);
        
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        
        System.out.println("--- ordem natural dos numeros - idade ---");
        System.out.println(estudantes);
        
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        
        System.out.println("-- ordem reversa dos numeros - idade ---");
        System.out.println(estudantes);
        
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("--- ordem natural dos numeros - idade (method refence) --");
        System.out.println(estudantes);
        
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        
        System.out.println("--Ordem reversa dos numeros- idade (method reference) ---");
        System.out.println(estudantes);
        
        Collections.sort(estudantes);
        
        System.out.println("--- ordemnatural dos numeros - idade(interface Comparable) --");
        System.out.println(estudantes);
        
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        
        System.out.println("-- ordem reversa dos números - idade(interface Comparator) --");
        System.out.println(estudantes);
    }
    
}
