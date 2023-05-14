//Segunda Atividade
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);

        int raio;
        double pi = 3.14159;

        System.out.println("Digite um valor do raio: ");
        raio = conta.nextInt();
        System.out.println("O valor da area é de: " + (pi * (raio * raio)));
    }


}
