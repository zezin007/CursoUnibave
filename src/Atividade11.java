import javax.swing.*;

public class Atividade11 {
    public static void main(String[] args) {
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while (true) {
            int combustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de combustível referente aos seguintes números:\n" +
                    "1- Gasolina\n" +
                    "2- Álcool\n" +
                    "3- Diesel\n" +
                    "4- Fim"));

            switch(combustivel) {
                case 1:
                    gasolina++;
                    break;
                case 2:
                    alcool++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    // Saída do loop
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }

            if (combustivel == 4) {
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade de abastecimentos:\n" +
                "Gasolina: " + gasolina + "\n" +
                "Álcool: " + alcool + "\n" +
                "Diesel: " + diesel);
    }
}
