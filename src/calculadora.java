import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Calculadora \n\n Digite um valor");
        valor1 = ler.nextInt();
        System.out.println("digite outro valor");
        valor2 = ler.nextInt();
        int soma, subtracao, multiplicacao;
        double divisao;
        soma = valor1 + valor2;
        System.out.println(valor1 + " + " + valor2 + " = " + soma);
        subtracao = valor1 - valor2;
        System.out.println(valor1 + " - " + valor2 + " = " + subtracao);
        multiplicacao = valor1 * valor2;
        System.out.println(valor1 + " x " + valor2 + " = " + multiplicacao);
        divisao = valor1 / (double) valor2;
        System.out.println(valor1 + " / " + valor2 + " = " + divisao);
    }
}
