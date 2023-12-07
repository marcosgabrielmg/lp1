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
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um valor inteiro maior ou igual a zero: ");
        int vi = leia.nextInt();
            while(vi<0){
                System.out.println("Valor inaceitável. Digite outro valor inteiro maior ou igual a zero: ");
                vi = leia.nextInt();
            }
        
    }
    
}
