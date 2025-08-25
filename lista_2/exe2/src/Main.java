import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // EXERCÍCIO 02
        // Entrada de dados

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nomePro = entrada.next();
        System.out.println("Informe a quantidade comprada: ");
        int quantidade = entrada.nextInt();
        System.out.println("Informe o preço unitário do produto: ");
        float Unidade = entrada.nextFloat();
        System.out.println("Escolha a forma de pagamento (1-PIX 2-CARTÃO 3-BOLETO): ");
        int pagamento = entrada.nextInt();


        // Calculando subtotal

        float subtotal = quantidade * Unidade;

        //Calculando desconto

        float desconto;

        if (subtotal < 100.00 ){
            desconto = 0;

        } else if (subtotal >= 100.00 && subtotal< 300.00) {
            desconto = 0.05F;

        } else {
            desconto = 0.10f;
        }

        // Aplicando o desconto

        float valor = subtotal * desconto;
        float valorDesconto = subtotal - valor;

        //ajustando com base na forma de pagamento

        float ajuste = 0;

        if (pagamento == 1){
            ajuste = -0.02f;

        } else if (pagamento == 2 ) {
            ajuste = 0.015f;

        }else {
            ajuste = 0f;
        }

        float ValorAjustado = valorDesconto * ajuste;
        float total = valorDesconto + ValorAjustado;

        //Resumo

        System.out.println("Produto :" + nomePro + "\nquantidade: " + quantidade +
                "\nDesconto aplicado: " + (desconto*100) + "%" + "\nForma de pagamento: " + pagamento +
                "\nTotal final: R$" + total);
    }
}