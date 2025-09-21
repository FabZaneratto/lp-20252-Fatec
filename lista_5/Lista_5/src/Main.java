import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] mat = new int[3][3];

        for (int i = 0; i < mat.length; i++){
            System.out.println("Escreva os valores da linha: " + (i+1));
            for (int j = 0; j < mat.length; j++) {
                System.out.println("Escreva os valores da coluna:" + (j+1));
                mat [i][j] = entrada.nextInt();
            }
        }
        System.out.println("\n\n\n");
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}