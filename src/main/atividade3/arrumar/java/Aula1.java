import javax.swing.*;
import java.util.Scanner;

public class Aula1 {
    static void main() {

        String pesoString = JOptionPane.showInputDialog("Insira o peso: ");
        double peso = Double.parseDouble(pesoString);
        String alturaString = JOptionPane.showInputDialog("Insira a altura: ");
        double altura = Double.parseDouble(alturaString);
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, imc);

    }
}