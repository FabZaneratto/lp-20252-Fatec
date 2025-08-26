import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {

        //Variáveis
        int aux;
        int a, b, c, d, e;
        Scanner entrada = new Scanner(System.in);

        //Entrada de dados

        System.out.println("Informe o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Informe o valor de B: ");
        b = entrada.nextInt();
        System.out.println("Informe o valor de C: ");
        c = entrada.nextInt();
        System.out.println("Informe o valor de D: ");
        d = entrada.nextInt();
        System.out.println("Informe o valor de E: ");
        e = entrada.nextInt();

        //Estrutura de repetição FOR

        for (int i=1; i<=4; i++){
            if (a > b) {
                aux = a; a = b; b = aux;
            }
            if (b > c){
                aux = b; b = c; c = aux;
            }
            if (c > d){
                aux = c; c = d; d = aux;
            }
            if (d > e){
                aux = d; d = e; e = aux;
            }

        }

        //Exibição do números ordenados após o FOR

        System.out.println("Elementos ordenados " + a + " " + b +
                " " + c + " " + d + " " + e);

    }
}
