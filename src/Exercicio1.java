import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        double valor1, valor2, dolar;
        dolar = 4.87;
        System.out.println("Doação ONG \n\n Digite o valor da doação");
        valor1 = ler.nextDouble();
        valor2 =  valor1*dolar;

        System.out.println("A doação foi de $" + valor1 + " equivalente a R$ " + df.format(valor2));

    }
}
