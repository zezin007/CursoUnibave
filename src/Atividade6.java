import javax.swing.JOptionPane;

public class Atividade6 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Digite um valor: ");
        int num1 = Integer.parseInt(input);
        String input1 = JOptionPane.showInputDialog(null, "Digite um valor: ");
        int num2 = Integer.parseInt(input1);

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            JOptionPane.showMessageDialog(null, "Os números são múltiplos.");
        } else {
            JOptionPane.showMessageDialog(null, "Os números não são múltiplos.");
        }
    }
}
