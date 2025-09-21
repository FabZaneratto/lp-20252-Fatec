public class exe_Vetor_06 {
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];


        for (int i=0; i<5; i++){
            vetorA[i] = (int) (Math.random()*21);
        }

        for (int i=0; i<5; i++){
            vetorB[i] = (int) (Math.random()*21);
        }
        int IA = 0;
        int IB = 0;

        for(int i=0; i<10; i++){
            if (i % 2 == 0){
                vetorC[i] = vetorA[IA]; IA++;
            }
            else {
                vetorC[i] = vetorB[IB]; IB++;
            }
        }

        System.out.println("Vetor A:");
        for (int i=0; i<5;i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B: ");
        for (int i=0; i<5; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor Resultante: ");
        for (int i=0; i<5; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
