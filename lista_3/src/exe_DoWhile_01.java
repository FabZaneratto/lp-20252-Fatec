import java.util.Scanner;

public class exe_DoWhile_01 {
    public static void main(String[] args) {
        //Variáveis

        Scanner entrada = new Scanner(System.in);
        int opcao;
        double saldo = 1000, deposito, saque =0;

        //Sistema de menu bancário(sem opção 4)

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
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    saque = entrada.nextDouble();

                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo depois do saque: R$" + saldo);
                    } else {
                        System.out.println("O saldo é insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("Função ainda não implementada.");
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

