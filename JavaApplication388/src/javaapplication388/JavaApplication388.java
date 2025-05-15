
package javaapplication388;

import java.util.Scanner;

public class JavaApplication388 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n1, n2, conta;
        
        System.out.println("Escolha um numero");
        n1 = ler.nextInt();
        System.out.println("Escolha outro numero");
        n2 = ler.nextInt();
        conta = n1 + n2;
        
        System.out.println("O resultado é " + conta);
        
        
    }
    
}
