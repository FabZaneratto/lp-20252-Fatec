import java.util.Scanner;

public class exe_vetor_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] contagem = new int[10];
        boolean[] contado = new boolean[10];


        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }


        for (int i = 0; i < vetor.length; i++) {
            if (!contado[i]) {
                int qtd = 1;
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        qtd++;
                        contado[j] = true;
                    }
                }
                contagem[i] = qtd;
            }
        }
        System.out.println("vetor formado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < vetor.length; i++) {
            if (!contado[i]) {
                System.out.println("Número " + vetor[i] + " aparece " + contagem[i] + " vezes");
            }
        }


    }
}
