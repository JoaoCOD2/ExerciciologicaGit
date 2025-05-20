/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medianotaindice;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class MediaNotaIndice {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
       String nome;
       double nota [] = new double [3];
       int i; double acMedia = 0;
        System.out.println("nome");
        nome = ler.next();
        for (i = 0; i < nota.length; i++){
            System.out.println("Informe a "+ (i+1) +"ª nota:");
            nota [i] = ler.nextDouble();
            acMedia += nota [i];
            acMedia = acMedia / i;
            if (acMedia >= 7){
                System.out.println(nome + "você está aprovado");
            }else{
                System.out.println(nome + "você está reprovado");
            }
            for (i = 0; i < nota. length; i++);
            System.out.println("nota" + (i+1) + nota [i]);
        }
        System.out.println("A média final é" + acMedia);
            
            
        }
        
    }
    

