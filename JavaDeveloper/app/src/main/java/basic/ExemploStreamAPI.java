
package basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Geisy 
 */
public class ExemploStreamAPI {

    public static void main(String[] args) {
       //criar a coleção de estudantes
       List<String> estudantes = new ArrayList<>();
       
       //adiciona estudantes
       estudantes.add("Pedro");
       estudantes.add("Thayse");
       estudantes.add("Marcelo");
       estudantes.add("Jão");
       estudantes.add("Juliana");
       
       //retorna a contagem de elementos
        System.out.println("Contagem: "+ estudantes.stream().count());

        //retorna o elemento com maior num de letras
        System.out.println("Maior numero de letras: "+ estudantes.stream().max(
                (Comparator.comparingInt(String::length))));
        
        //retorna o elemento com menor num de letras
        System.out.println("Menor numero de letras: "+ estudantes.stream().min(
                (Comparator.comparingInt(String::length))));
    
        //retorna os elementos que tem a letra R no nome
        System.out.println("nomes com r: " + estudantes.stream().filter((estudante)
        -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
    
        //retorna uma nova colecao, com os nomes concatenados a qnt de letra de cada nome
        System.out.println("\nnova colecao com a quant de letras: " + estudantes
                .stream().map(estudante -> estudante.concat("-").concat
        (String.valueOf
        (estudante.length()))).collect(Collectors.toList()));
        
        //retorna somente os 3 primeiros elementos
        System.out.println("\n3 primeiros: " + estudantes.stream().limit(3).
                collect(Collectors.toList()));
        
        //exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().
                peek(System.out::println).collect(Collectors.toList()));
        
        //exibe cada elemento no console sem retornar outra colecao
        System.out.println("retorna os elementos novamente:");
        estudantes.stream().forEach(System.out::println);
        
        //retorna true se todos os elemntos possuem a letra w no nome
        System.out.println("tem w: " + estudantes.stream().allMatch((elemento) 
                -> elemento.contains("w")));
        
        //retorna true se algum dos elementos possuem a letra a minuscula no nome
        System.out.println("Tem algum elemento com a minusculo no nome?" + 
                estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
        //retorna true se algum dos elementos possuem a letra a minuscula no nome
        System.out.println("Tem algum elemento com a minusculo no nome?" + 
                estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
        
        //retorna o primeiro elemento da colecao, se existi exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        
        //exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
       System.out.println(estudantes.stream().peek(System.out::println)
       .map(estudante -> estudante.concat("-").concat(String.valueOf(estudante.length()))));
    }
    
}
