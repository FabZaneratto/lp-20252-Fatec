import java.util.Scanner;

public class exe_Vetor_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[10];
        float[] notas = new float[10];
        float soma = 0;

        // Leitura dos nomes
        System.out.println("Digite os nomes dos alunos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Aluno " + (i+1) + ": ");
            nomes[i] = entrada.next();
        }

        // Leitura das notas
        System.out.println("\nDigite as notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + nomes[i] + ": ");
            notas[i] = entrada.nextFloat();
            soma += notas[i];
        }

        // Cálculo da média
        float media = soma / notas.length;
        System.out.println("\nMédia da turma: " + media);

        // Mostrando quem ficou acima da média
        System.out.println("\nAlunos acima da média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Índice " + i + " - " + nomes[i] + " (Nota: " + notas[i] + ")");
            }
        }


    }
}

