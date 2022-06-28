

public class ThreadExemplo {
    public static void main(String[] args) {
        //BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        //barraDeCarregamento2.start();

        //BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();
        //barraDeCarregamento3.start();

        //Thread thread1 = new Thread(new BarraDeCarregamento2());
        //Thread thread2 = new Thread(new BarraDeCarregamento3());

        //thread1.start();
        //thread2.start();

        /*System.out.println("Nome da thread : " + thread1.getName());
        System.out.println("Nome da thread : " + thread2.getName());*/

        GeradorPdf iniciarGerarPdf = new GeradorPdf();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPdf);

        iniciarGerarPdf.start();
        iniciarBarraDeCarregamento.start();



    }
}

class GeradorPdf extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Iniciar a geração de pdf");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pdf gerado!");
    }

}

class BarraDeCarregamento extends Thread {

    private Thread iniciarGerarPdf;

    public BarraDeCarregamento(Thread iniciarGerarPdf) {
        this.iniciarGerarPdf =  iniciarGerarPdf;
    }

    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(5000);
                if(iniciarGerarPdf.isAlive()){
                    break;
                }
                System.out.println("Loanding...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("rodei BarraDeCarregamento2 : " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 extends Thread{
    @Override
    public void run() {

        try {
            Thread.sleep(10000);
            System.out.println("rodei BarraDeCarregamento3 : " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}