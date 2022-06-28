import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String[] nomes = {"Joao","Joao","Paulo","Oliveira","Santos", "Instrutor"};
        Integer[] numeros = {1,2,3,4,5};
        //imprimirNomesFiltrados(nomes);
        //imprimirTodosOsNomes(nomes);
        //imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Professor");
        profissoes.add("Engenheiro");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");
        profissoes.stream().filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirTodosOsNomes(String[] nomes){
        for (String nome: nomes){
            System.out.println("imprimido pelo for: " +nome);
        }

    }

    public static void imprimirNomesFiltrados(String[] nomes) {
        String nomesParaImprimir = "";
        for (int i = 0;i < nomes.length; i++){
            if(nomes[i].equals("Joao")){
                nomesParaImprimir += " " + nomes[i];
            }
        }
        System.out.println(nomesParaImprimir);
        Stream.of(nomes).filter( nome -> nome.equals("Joao")).collect(Collectors.joining());

        System.out.println(nomesParaImprimir);
    }

    public static void imprimirODobroDeCadaItemDaLista(Integer[] numeros){
        for(Integer numero: numeros){
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero -> numero*2).forEach(System.out::println);
    }

}
