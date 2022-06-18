
package basic;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 *
 * @author VAIO
 */
public class ExemploOptionalPrimitivos {

    public static void main(String[] args) {
        System.out.println("**valor inteiro opcional**");
        OptionalInt.of(12).ifPresent(System.out::println);
    
        System.out.println("**valor decimal opcional**");
        OptionalDouble.of(55.3).ifPresent(System.out::println);
        
        System.out.println("**Valor longo opcional**");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
    
}
 