import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //EXERCÍCIO 01
        //Entrada de dados

        System.out.println("Informe o Nome do paciente: ");
        String nome = entrada.next();
        System.out.println("Informe o peso em KG: ");
        float peso = entrada.nextFloat();
        System.out.println("Informe a altura em metros: ");
        float altura = entrada.nextFloat();

        //Calculando o IMC e gerando classificação
        float imc = peso / (altura * altura);

        String classificacao;

        if (imc < 18.5f){
            classificacao = "Abaixo do peso";
        }
        else if (imc >= 18.5f && imc < 25.0f) {
            classificacao = "Peso normal";
        }
        else if (imc >= 25.0f && imc < 30.0f ) {
            classificacao = "Sobrepeso";
        }
        else  {
            classificacao = "Obesidade" ;
        }


        //Exibindo mensagem Final
        System.out.println("O paciente " + nome + " tem IMC = " + imc +
                " e está classificado como " + classificacao);

    }
}