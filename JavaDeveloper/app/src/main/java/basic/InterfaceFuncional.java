public class InterfaceFuncional {
    public static void main(String[] args) {
    //usando lampda
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Charlie"));

        Funcao2 funcao2 = valor -> {
            System.out.println(valor);
        };
        funcao2.gerar("Paul");
    }


    interface Funcao{
        String gerar(String valor);
    }

    interface Funcao2{
        void gerar(String valor);
    }
}
