import java.util.Scanner;

public class exe_vetor_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        float[] notas = new float[10];

        String[] aprovados = new String[10];
        String[] reprovados = new String[10];
        int contAprovados = 0;
        int contReprovados = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite a nota do aluno " + nomes[i] + ": ");
            notas[i] = sc.nextFloat();
            sc.nextLine();

        }


        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 7.0) {
                aprovados[contAprovados] = nomes[i];
                contAprovados++;
            } else {
                reprovados[contReprovados] = nomes[i];
                contReprovados++;
            }
        }


        System.out.print("\nAprovados: ");
        for (int i = 0; i < contAprovados; i++) {
            System.out.print(aprovados[i] + " ");
        }


        System.out.print("\nReprovados: ");
        for (int i = 0; i < contReprovados; i++) {
            System.out.print(reprovados[i] + " ");
        }


    }
}

