import java.util.function.UnaryOperator;

public class ParadigmaFuncional {

    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor *3;
        int valor = 10;

        System.out.println("O resultado: "+calcularValorVezes3.apply(10));

    }
}
