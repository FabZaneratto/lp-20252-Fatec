import java.util.Scanner;
import java.awt.*;

public class exe02_matriz{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int soma;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz Gerada \n");
        for (int i = 0; i < mat.length; i++) {
            soma=0;
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
                soma += mat[i][j];
            }
            System.out.println(" | Soma da linha " + (i + 1) + " = " + soma);
        }
    }
}