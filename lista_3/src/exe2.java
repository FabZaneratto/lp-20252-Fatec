import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float compra;
        float soma = 0;
        int contador = 0;
        float media = 0;

        System.out.println("Digite o valor da compra (-1 para encerrar): ");
        compra = entrada.nextFloat();

        while (compra != -1) {
            soma += compra;
            contador++;

            System.out.println("Digite o valor da compra (-1 para encerrar): ");
            compra = entrada.nextFloat();
        }

        if (contador > 0) {
            media = soma / contador;
            System.out.println("Total de vendas: R$" + soma +
                    "\nClientes atendidos: " + contador +
                    "\nMédia de gasto por cliente: " + media);
        } else {
            System.out.println("Nenhuma compra registrada.");
        }
    }
}

