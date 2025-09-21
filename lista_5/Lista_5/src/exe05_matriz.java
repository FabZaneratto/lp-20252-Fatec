import java.util.Scanner;

public class exe05_matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float [][] mat = new float[3][4];
        String [] nome = new String[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("informe o nome do aluno: ");
            nome[i] = entrada.next();
            System.out.println("informe as 4 notas do aluno: ");
            for (int j = 0; j <4; j++) {
                mat[i][j] = entrada.nextFloat();
            }

        }

        for (int i = 0; i < mat.length; i++) {
            int soma = 0;
            int media = 0;
            for (int j = 0; j < mat.length; j++) {
                soma += mat[i][j];
                media = soma/4;
            }
            System.out.println("A média do aluno: " + nome[i] + " é: " +  media);
        }


    }
}
