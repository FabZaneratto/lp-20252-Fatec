import java.util.Scanner;

public class exe_Vetor_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[10];
        float[] vetor = new float[10];
        float media = 0;
        float soma = 0;

        System.out.println("Digite as notas dos alunos:");
        for (int i=0; i< vetor.length; i++){

        }
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = entrada.nextFloat();
            soma += vetor [i];
            media = soma / vetor.length;
        }
        int psmaior = 0;
        int psmenor = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] > media){
                psmaior++;
            }
            else {
                psmenor++;
            }
        }

        System.out.println("A media dos alunos é de" +media);
        System.out.println("Os alunos que ficaram acima da media foram :"+psmaior);
        System.out.println("Os alunos que ficaram abaixo da media foram :"+psmenor);

    }
}
