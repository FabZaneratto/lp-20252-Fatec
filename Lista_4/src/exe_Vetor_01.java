import java.util.Scanner;

public class exe_Vetor_01 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i=0; i<vetor.length; i++){
            vetor[i] = (int) (Math.random() *10);
        }

        System.out.println("Elementos do vetor: ");
        for (int i=0; i< vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }

    }
}
