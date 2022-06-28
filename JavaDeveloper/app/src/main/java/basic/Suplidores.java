import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> intanciarPessoa = () -> new Pessoa();

        System.out.println(intanciarPessoa.get());


    }

    public static class Pessoa{
        private String nome;
        private Integer idade;

        public Pessoa(){
            nome = "Taylor";
            idade = 32;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }
}
