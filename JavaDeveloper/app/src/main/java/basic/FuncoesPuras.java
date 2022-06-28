import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> verificarSetMaior = (parametro,
        valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSetMaior.test(13,12));
        System.out.println(verificarSetMaior.test(13,12));
    }
}
