public class exe_Vetor_02 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vetorD = new int[5];

        for (int i=0; i< vetor.length; i++){
            vetor[i] =(int) (Math.random() * 10);
            vetorD[i] = vetor[i] * 2;
        }

        //Exibindo
        System.out.println("=====Exibindo os vetores=====");
        for (int i=0; i< vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }

        System.out.println("");

        for (int i=0; i< vetorD.length; i++){
            System.out.print(vetorD[i]+" ");
        }

    }

}
