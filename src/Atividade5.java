import javax.swing.JOptionPane;
public class Atividade5 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite um valor: ");
        int num = Integer.parseInt(input);
        
        if (num % 2 == 0){
            System.out.println("Este número é Par");
        }
        else {
            System.out.println("Este numero é Ímpar");

        }
    }
}


        
    
    

