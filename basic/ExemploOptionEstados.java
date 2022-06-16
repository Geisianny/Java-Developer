
package basic;

import java.util.Optional;

/**
 *
 * @author VAIO
 */
public class ExemploOptionEstados {

    public static void main(String[] args) {
       Optional<String> optionalString = Optional.of("Valor presente");
       
       System.out.println("valor opcional que está presente");
       optionalString.ifPresentOrElse(System.out::println,() -> 
       System.out.println(" não está presente"));
        
       Optional<String> optionalNull = Optional.ofNullable(null);
      
        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println,() -> System.
                out.println("null = não esta presente"));
        
        Optional<String> emptyOptional = Optional.empty();
        
        System.out.println("Valor opcional que não esta presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println 
                ("empty = não está presente"));
        
        Optional<String> optionlNullErro = Optional.of(null);
        
        System.out.println("Valor opcional que lança erro nullPointerException");
        optionlNullErro.ifPresentOrElse(System.out::println, () -> System.out.println
        ("Erro = não está presente"));
    
    }
    
    
}
