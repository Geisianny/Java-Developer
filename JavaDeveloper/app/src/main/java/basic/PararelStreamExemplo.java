import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PararelStreamExemplo {
    public static void main(String[] args) {

        /*long inicio = System.currentTimeMillis();
        IntStream.range(1,10000).forEach(num -> System.out.println(fatorial(num)));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução :: " + (fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println( "tempo de execução :: " + (fim-inicio));*/

        List<String> nomes = Arrays.asList("Joao","Paulo","Oliviera","Santos");
        nomes.parallelStream().forEach(System.out::println);


    }


    public static long fatorial(long num){
        int fat = 0;

        for (int i = 2; i <= num;i++){
            fat*= i;
        }

        return fat;
    }

}
