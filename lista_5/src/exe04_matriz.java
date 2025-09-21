import java.util.Scanner;

public class exe04_matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o tamanho da matriz: ");
        int n = entrada.nextInt();

        int [][] mat1 = new int[n][n];

        for (int i=0; i<mat1.length; i++){
            for (int j=0; j< mat1.length; j++){
                if (i==j){
                    mat1[i][j] = 1;
                }
                else{
                    mat1[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz gerada: ");
        for (int i=0; i< mat1.length; i++){
            for (int j=0; j< mat1.length; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
