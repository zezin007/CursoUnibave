import javax.swing.*;

public class Atividade10 {
    public static void main(String[] args) {
        int senhaDefinida = 123456;
        int senha;
         do {
             senha = Integer.parseInt(JOptionPane.showInputDialog("digite a senha"));
             if (senha != senhaDefinida){
                 JOptionPane.showMessageDialog(null, "Senha Errada");

             }

        }while (senha != senhaDefinida);
         JOptionPane.showMessageDialog(null, "Acesso liberado");

    }

}
