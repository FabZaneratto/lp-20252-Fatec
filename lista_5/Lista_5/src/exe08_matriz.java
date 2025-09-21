import java.util.Scanner;

public class exe08_matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] soma = new int[3][3];


        System.out.println("Digite os 9 números da matriz A (linha por linha):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = entrada.nextInt();
            }
        }


        System.out.println("Digite os 9 números da matriz B (linha por linha):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = entrada.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }


        System.out.println("\nMatriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nMatriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nMatriz resultante da soma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }


    }
}

