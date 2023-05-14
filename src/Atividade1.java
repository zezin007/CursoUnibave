import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = sc.nextInt();
        System.out.println("Digite um número: ");
        num2 = sc.nextInt();
        int resultado  = (num1 + num2);

        System.out.println("Resultado: " +  resultado);

    }
}
