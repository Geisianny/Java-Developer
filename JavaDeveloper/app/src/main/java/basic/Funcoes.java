import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteger = string -> Integer.valueOf(string) * 2;

        System.out.println(retornarNomeAoContrario.apply("Taylor"));
        System.out.println(converterStringParaInteger.apply("20"));
    }
}
