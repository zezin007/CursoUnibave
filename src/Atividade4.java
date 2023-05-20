import javax.swing.JOptionPane;

public class Atividade4 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite um valor: ");
        int num1 = Integer.parseInt(input);
        
        if (num1 < 0){
            System.out.println("Este número é negativo");
        }
        else if (num1 >= 0) {
            System.out.println("Este numero é Positivo");

        }
    }
}
