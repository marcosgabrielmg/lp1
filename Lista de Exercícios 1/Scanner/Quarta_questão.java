/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarta_questão;

import java.util.Scanner;

/**
 *
 * @author marbi
 */
public class Quarta_questão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um valor inteiro maior ou igual a zero: ");
        long vi = leia.nextLong();
            while(vi<=0){
                System.out.println("Valor inaceitavel. Digite outro valor inteiro maior ou igual a zero: ");
                vi = leia.nextLong();
            }
        
        while(vi>0){
            vi = vi/10;
            i++;
        }
        
        System.out.println("O valor inserido tem " + i + " digito(s).");
    }
}
    
}
