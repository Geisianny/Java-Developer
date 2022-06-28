public class Recursividade {

    public static void main(String[] args) {
        System.out.println(fatorial(0));
        System.out.println(fatorialA(5));
    }

    public static int fatorial(int numero){
        if(numero == 1 || numero == 0){
            return 1;
        }else{
            return numero * fatorial(numero - 1);
        }
    }

    public static double fatorialA(double numero){
        return fatorialComTailCall(numero,1);
    }

    public static double fatorialComTailCall(double valor,double numero){
        if(valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor-1,numero*valor);
    }
}
