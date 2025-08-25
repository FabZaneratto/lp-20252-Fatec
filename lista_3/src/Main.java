import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variáveis

        int contador = 1;
        float nota;
        float soma = 0;
        Scanner sc = new Scanner(System.in);

        //Entrada de dados usando o contador

        while (contador <=5){
            System.out.println("Informe a nota " + contador + ":");
            nota = sc.nextFloat();
            soma += nota;
            contador++;
        }

        float media = soma/5;
        System.out.println("Média: "+media);


    }
}
