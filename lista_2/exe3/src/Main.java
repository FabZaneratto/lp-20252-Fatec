import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //EXERCÍCIO 03
        //Entrada de dados

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.next();
        System.out.println("Digite as notas: ");
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        System.out.println("Digite o peso das notas: ");
        float peso1 = entrada.nextFloat();
        float peso2 = entrada.nextFloat();
        float peso3 = entrada.nextFloat();

        //Calculando média ponderada

        float mediaPond = (nota1*peso1 + nota2*peso2 + nota3*peso3)/ (peso1 + peso2 + peso3);

        //Analisando a situação do aluno

        String situacao = "";
        float notaExame = 0f;

        if (mediaPond >= 7.0) {
            situacao =  "Aprovado";
        } else if (mediaPond >= 4.0) {
            situacao = "Exame";
            notaExame = 10 - mediaPond;
        } else {
            situacao = "Reprovado";
        }

        System.out.println("----------BOLETIM----------");
        System.out.println("Nome: " + nome + "\nMédia: " + mediaPond + "\nSituação: " + situacao );

        if (situacao.equals("Exame")){
            System.out.println("\nNota mínima para o exame: " + notaExame);
        }



    }
}