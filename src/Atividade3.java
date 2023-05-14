import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {

        int valor1;
        int valor2;
        int valor3;
        int valor4;

        Scanner valores = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = valores.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = valores.nextInt();
        System.out.println("Digite o terceiro valor: ");
        valor3 = valores.nextInt();
        System.out.println("Digite o quarto valor: ");
        valor4 = valores.nextInt();
        int diferenca = ((valor1 * valor2) - (valor3 * valor4));
        System.out.println("A diferença dos valores é de: " + diferenca);

    }
}
