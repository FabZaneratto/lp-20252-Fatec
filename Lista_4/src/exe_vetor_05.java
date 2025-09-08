import java.util.Scanner;

public class exe_vetor_05 {
    public static void main(String[] args) {
        int[] vetor = new int[15];

        Scanner entrada = new Scanner(System.in);

        // Preenche o vetor com valores aleatórios entre 0 e 9
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
        }

        // Mostra os números do vetor (só para conferirmos)
        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nDigite um número para realizar a busca: ");
        int buscado = entrada.nextInt();

        boolean encontrado = false;

        // Faz a pesquisa no vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == buscado) {
                System.out.println("Número encontrado no índice: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }


    }
}

