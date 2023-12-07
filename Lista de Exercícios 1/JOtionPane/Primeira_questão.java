/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeira_questão;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author marbi
 */
public class Primeira_questão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float  soma = 0;
        
        String nome = JOptionPane.showInputDialog("Olá, aluno. Antes de começar, me diga qual o seu nome: ");
        JOptionPane.showMessageDialog(null, nome + ", para saber se você foi aprovado ou reprovado, insira suas três notas, respectivamente: ");
            for(int i=0; i<3; i++){
                String n1 = JOptionPane.showInputDialog("Insira a nota: ");
                    float p1 = Float.parseFloat(n1);
                        soma += p1;
            }
            
            if(soma/3 >= 7){
                JOptionPane.showMessageDialog(null,"Você foi aprovado! Sua média é: " + new DecimalFormat(".##").format(soma/3) + ".");
            }else{
                JOptionPane.showMessageDialog(null, "Você foi reprovado. Sua média é: " + new DecimalFormat(".##").format(soma/3) + ".");
                String recu = JOptionPane.showInputDialog(nome + ", insira a nota da sua recuperação");
                    float recpa = Float.parseFloat(recu);
                        if((soma/3 + recpa) / 2 >= 5){
                            JOptionPane.showMessageDialog(null,"Você foi aprovado! Sua média é: " + new DecimalFormat(".##").format((soma/3 + recpa) / 2) + ".");
                         }else{
                            JOptionPane.showMessageDialog(null, "Você foi reprovado. Sua média é: " + new DecimalFormat(".##").format((soma/3 + recpa) / 2) + ".");
                        }
            }
    }
}   
