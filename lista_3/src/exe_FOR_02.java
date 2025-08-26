import java.util.Scanner;

public class exe_FOR_02 {
    public static void main(String[] args) {

        // Variáveis

        Scanner entrada = new Scanner(System.in);
        int num;
        float soma = 0;

        //Entrada de dados

        System.out.println("Digite um números para fazer a soma desde 1: ");
        num = entrada.nextInt();

        //Processamento
         for (int i = 1; i <= num; i++ ){
             if (i  %2 == 0){
                 soma += i;
             }
         }


        System.out.println("A soma dos pares de 1 até "+num + " é: " + soma);
    }
}
