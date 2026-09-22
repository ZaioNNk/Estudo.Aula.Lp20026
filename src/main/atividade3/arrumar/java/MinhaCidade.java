import javax.swing.*;

public class MinhaCidade {
    static void main() {
        String stringCidade = JOptionPane.showInputDialog("Digite o nome do cidade: ");
        String stringNome = JOptionPane.showInputDialog("Digite seu nome: ");

        System.out.println("oi!" + stringNome + "! que legal saber que voce é da cidade " + stringCidade);
    }
}
