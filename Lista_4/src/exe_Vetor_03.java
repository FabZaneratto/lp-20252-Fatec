import java.util.Scanner;

public class exe_Vetor_03 {
    public static void main(String[] args) {
         int[] vetor = new int[8];
         int posicaoMN = 0;
         int posicaoMA = 0;
         Scanner entrada = new Scanner(System.in);



        System.out.println("Digite os números pra o vetor");
         for (int i = 0; i < vetor.length; i++){
             vetor[i] = entrada.nextInt();
         }

        int menor = vetor[0];
         for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
                posicaoMN = i;
            }
        }

         int maior = vetor[0];
         for (int i=0; i < vetor.length;i++){
             if (vetor[i] > maior){
                 maior = vetor[i];
                 posicaoMA = i;
             }
         }
        System.out.println("Maior" + maior + " posição:"+ posicaoMA);
        System.out.println("menor " + menor + " Posicção: "+ posicaoMN);

    }
}
