import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.00");
        double litrosAbasteceu, kmPainelCarroInicio, kmPainelCarroFim, kmRodados,mediaKm;

        System.out.println("Calculo media \n\n Digite o km do painel do carro no inicio da viagem: ");
        kmPainelCarroInicio = ler.nextDouble();
        System.out.println("Digite o km do painel do carro ao chegar no posto de gasolina: ");
        kmPainelCarroFim = ler.nextDouble();
        System.out.println("Digite a quantidade de litros abastecida: ");
        litrosAbasteceu = ler.nextDouble();

        kmRodados = kmPainelCarroFim - kmPainelCarroInicio;
        mediaKm = kmRodados/litrosAbasteceu;

        System.out.println("Resultado \n\n A media do veiculos é de " + df.format(mediaKm) +  " km/litro rodando " + kmRodados + "km");
    }
}
