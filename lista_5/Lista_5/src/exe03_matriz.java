import java.awt.*;
import java.util.Scanner;

public class exe03_matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] mat = new int[3][3];
        int somadiagonal= 0;

        //criando a matriz
        System.out.println("Gerando Matriz:");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = (int) (Math.random() *10); //sorteio para a criação da matriz
                if (i == j) { //especificando que é a soma só da diagonal principal
                    somadiagonal += mat[i][j];
                }
            }
        }
        System.out.println("Matriz Gerada \n");
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(somadiagonal);
    }
}
