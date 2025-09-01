import java.util.Scanner;

public class exe_FOR_01 {
    public static void main(String[] args) {
        //Variáveis

        Scanner entrada = new Scanner(System.in);
        int num ;

        //Entrada do número desejado

        System.out.println("Digite um número para fazer a tabuada: ");
        num = entrada.nextInt();

        //Formulando a tabuada
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " " + " X " + " " + i + " " + " = " + i * num);
        }
    }
}
