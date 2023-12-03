/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programateste;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author marbi
 */
public class Programateste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Olá, aluno. Antes de começar, me diga qual o seu nome: ");
        JOptionPane.showMessageDialog(null, nome + ", para saber se você foi aprovado ou reprovado, vamos precisar de suas notas. ");
        String n1 = JOptionPane.showInputDialog("Insira sua primeira nota: ");
           float p1 = Float.parseFloat(n1);
        String n2 = JOptionPane.showInputDialog("Insira sua segunda nota: ");
           float p2 = Float.parseFloat(n2);
        String n3 = JOptionPane.showInputDialog("Insira sua terceira nota: ");
           float p3 = Float.parseFloat(n3);
        
        float media = (p1 + p2 + p3)/ 3;
            if(media >= 7){
                JOptionPane.showMessageDialog(null,"Você foi aprovado! Sua média é: " + new DecimalFormat(".##").format(media) + ".");
            }else{
                JOptionPane.showMessageDialog(null, "Você foi reprovado. Sua média é: " + new DecimalFormat(".##").format(media) + ".");
                String recu = JOptionPane.showInputDialog(nome + ", insira a nota da sua recuperação");
                    float recpa = Float.parseFloat(recu);
                float mediaf = (media + recpa) / 2;
                    if(mediaf >= 5){
                        JOptionPane.showMessageDialog(null,"Você foi aprovado! Sua média é: " + new DecimalFormat(".##").format(mediaf) + ".");
                     }else{
                        JOptionPane.showMessageDialog(null, "Você foi reprovado. Sua média é: " + new DecimalFormat(".##").format(mediaf) + ".");
                    }
            }
    }
}
