import java.util.Scanner;

//todo programa java começa definido uma classe

public class Main {
    // definição de função main, executada quando o programa roda

    public static void main(String[] args) {

        // Comando de saida - a função println pertence a classe System
        System.out.println("Bom dia!");

        //java é fortemente tipado (float, char, int, double, boolean)
        // declara a variável e atribui valor a ela

        char letra = 'A';
        float nota = 6.5f ;
        int idade = 19;
        boolean resposta = true;
        String nome = "Fabricio";

        //Exibe os dados das variáveis para o usuário
        // System.out.println("Letra: " + letra + "\nNota: " + nota +
        // "\nIdade: " + idade + "\nResposta: " + resposta +
        // "\nNome: " + nome);

        // Comando dde entrada
        //Utilização da classe Scanner
        Scanner entrada = new Scanner(System.in);
        //System.out.println("Digite uma nota: ");
        //float nota1 = entrada.nextFloat();
        //System.out.println("Digite outra nota: ");
        //float nota2 = entrada.nextFloat();
        //System.out.println("Digite o nome do aluno: ");
        //String nomeAluno = entrada.next();

        //Calcula a soma das notas
        //float soma = nota1 + nota2;
        //float media = soma /2;

        //System.out.println("O aluno: "+ nomeAluno + " Tem como média: " + media);

        //exercício 1
        System.out.println("Informe o nome do Funcionário: ");
        String nomeFuncionario = entrada.next();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        float horas = entrada.nextFloat();
        System.out.println("informe o valor das horas trabalhadas: ");
        float valor = entrada.nextFloat();

        //calcula o salário bruto
        float salarioBruto = horas * valor;

        System.out.println("O funcionário " + nomeFuncionario +  ", trabalhou " +
                horas +" horas" + " e receberá: R$" + salarioBruto);


    }
}