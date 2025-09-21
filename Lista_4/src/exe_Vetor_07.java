public class exe_Vetor_07 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        // Preenche A e B com números aleatórios entre 1 e 21
        System.out.print("Vetor A: ");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = (int) (Math.random() * 21) + 1;
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = (int) (Math.random() * 21) + 1;
            System.out.print(vetorB[i] + " ");
        }

        // Interseção
        int IC = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC[IC] = vetorA[i];
                    IC++;
                    break; // evita repetir o mesmo número várias vezes
                }
            }
        }

        // Exibe interseção
        System.out.print("\nVetor da interseção: ");
        for (int i = 0; i < IC; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}

