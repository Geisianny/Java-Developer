public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a + b;
        Calculo subtracao = (a,b) -> a - b;
        Calculo multiplicao = (a,b) -> a * b;
        Calculo divisao = (a,b) -> a / b;

        System.out.println(executarOperacao(soma,1,3));//4
        System.out.println(executarOperacao(subtracao,2,3));//-1
        System.out.println(executarOperacao(multiplicao,1,5));//5
        System.out.println(executarOperacao(divisao,10,5));//2
    }

    public static int executarOperacao(Calculo calculo, int a , int b){
        return calculo.calcular(a,b);
    }


@FunctionalInterface
    interface Calculo{
        public int calcular(int a, int b);
    }
}
