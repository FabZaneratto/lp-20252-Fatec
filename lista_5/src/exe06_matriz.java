public class exe06_matriz {
    public static void main(String[] args) {
        int [][] mat = new int[5][5];

        //Escrevendo e exibindo a matriz (preenchida randomicamente)
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random() * 21);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }

        //Declarando maior e posições a serem encontradas
        int maior = mat[0][0];
        int pI = 0;
        int pJ = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > maior){
                    maior = mat[i][j];
                   pI = i;
                   pJ = j;
                }
            }
        }

        System.out.println("\nNúmero da matriz: " + maior);
        System.out.println("Posição: i= " + pI + " j= " + pJ);




    }
}
