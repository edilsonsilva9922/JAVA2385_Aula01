import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        /*
        System.out.println("Boa noite");
        System.out.println("Sejam bem vidos");
        int idade = 0;
        String nome = "";
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, insira usa idade:");
        try {
            idade = leitor.nextInt();
            System.out.println("A idade digita é " + idade);
        } catch (Exception e) {
            System.out.println("Caracter incorerto digitado - " + e);
        }
        System.out.println("Por favor, insira seu nome:");
        try {
            nome = leitor.next();
            System.out.println("o nome digitado é " + nome);
        } catch (Exception e) {
            System.out.println("Caracter incorerto digitado - " + e);
        }
        System.out.println("Usuario " + nome + " tem " + idade + " anos");
        leitor.close();
    */
        int divisao = 5/2;
        System.out.println("resultado = " + divisao);
        double resultado = 5 / 2.0;
        System.out.println("resultado = " + resultado);

        int resto = 5%2;
        System.out.println("resto da divisão de 5/2 = " + resto);
        int x = 20;
        x+=3;
        System.out.println("20+3 = " + x);
        x++;
        System.out.println("23+1 = " + x);

    }
}
