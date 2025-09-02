import java.util.Scanner;

public class Exe_01 {
    public static void main(String[] args) {
        //Variáveis

        Scanner entrada = new Scanner(System.in);
        int opcao;
        double saldo = 1000, deposito, saque =0;

        //Vetor string que guarda 1000 posições
        // vetor que guarda as operações de depósito e saque

        String[] vetor = new String[1000];
        int indice = 0;

        //Sistema de menu bancário

        do {
            System.out.println("=====MENU BANCÁRIO=====");
            System.out.println(" 1. Consultar saldo \n 2. Depositar \n 3. Sacar \n 4. Ver Extrato \n 0. Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é de: R$" + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja depositar:");
                    deposito = entrada.nextDouble();
                    saldo += deposito;
                    System.out.println("Seu saldo atual é de: R$" + saldo);
                    vetor[indice] = "Depósito de R$" + deposito;// insere o depósito no vetor
                    indice++;//adiciona posição no índice
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    saque = entrada.nextDouble();

                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo depois do saque: R$" + saldo);
                        vetor[indice] = "Saque de R$" + saque;
                        indice++;
                    } else {
                        System.out.println("O saldo é insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("-----EXTRATO-----");
                    for (int i=0; i<indice; i++ ){
                        System.out.println(vetor[i]);
                    }
                    break;

                case 0:
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente");
            }


        } while (opcao != 0);
    }
}
