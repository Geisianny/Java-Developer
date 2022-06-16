
package basic;

import java.util.Optional;

/**
 *
 * @author VAIO
 */
public class ExemploOptionEstados {

    public static void main(String[] args) {
       Optional<String> optionalString = Optional.of("Valor presente");
       
       System.out.println("valor opcional que est� presente");
       optionalString.ifPresentOrElse(System.out::println,() -> 
       System.out.println(" n�o est� presente"));
        
       Optional<String> optionalNull = Optional.ofNullable(null);
      
        System.out.println("Valor opcional que n�o est� presente");
        optionalNull.ifPresentOrElse(System.out::println,() -> System.
                out.println("null = n�o esta presente"));
        
        Optional<String> emptyOptional = Optional.empty();
        
        System.out.println("Valor opcional que n�o esta presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println 
                ("empty = n�o est� presente"));
        
        Optional<String> optionlNullErro = Optional.of(null);
        
        System.out.println("Valor opcional que lan�a erro nullPointerException");
        optionlNullErro.ifPresentOrElse(System.out::println, () -> System.out.println
        ("Erro = n�o est� presente"));
    
    }
    
    
}
