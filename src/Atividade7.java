import javax.swing.JOptionPane;

public class Atividade7 {
     public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite o grau de dor que você está sentindo");
        int num1 = Integer.parseInt(input);

        if (num1 <= 25) {
            JOptionPane.showMessageDialog(null,"É apenas uma dor leve, isso vai passar.");
        }
        else if (num1 >= 26 && num1 <= 49)  {
            JOptionPane.showMessageDialog(null,"Essa dor não é comum, devemos ver o que está acontecendo.");
        }
        else if (num1 >= 50) {
            JOptionPane.showMessageDialog(null, "Você passara por uma série de avaliações para definir qual é o problema.");
        }
        if (num1 > 80 ) {
            JOptionPane.showMessageDialog(null, "Você está provavelmente está com uma urgencia, devera encaminhar-se para o Hospital mais proximo para avaliar sua situaçao.");
        }
    }
}
