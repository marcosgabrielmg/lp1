/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda_questão;

import javax.swing.JOptionPane;

/**
 *
 * @author marbi
 */
public class Segunda_questão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String qtl = JOptionPane.showInputDialog("Olá, Leitor. Quantos livros você vai comprar para participar da promocão?");
       Float ql = Float.parseFloat(qtl);
       
       float cA = (float) (0.25 * ql + 7.5);
       float cB = (float) (0.5 * ql + 2.5);
        if (cA < cB) {
             JOptionPane.showMessageDialog(null, "O melhor desconto está no Critério A.");
        }else if (cB < cA){
             JOptionPane.showMessageDialog(null, "O melhor desconto está no Critério B.");
        }else{
             JOptionPane.showMessageDialog(null, "Os dois critérios tem o mesmo desconto.");
        }
       
        JOptionPane.showMessageDialog(null, "Boa leitura!!");
    }
    
}
