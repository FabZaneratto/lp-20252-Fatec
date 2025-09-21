public class exe07_matriz {
    public static void main(String[] args) {

        int[][] matriz = new int[3][2];    // matriz 3x2
        int[][] transposta = new int[2][3]; // matriz 2x3


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = (int) (Math.random()* 21);
            }
        }
        System.out.println("Matriz gerada de forma randomica: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }


        System.out.println("\nMatriz transposta (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }


    }
}
