
package exercicio01;

import java.util.Scanner;
public class Exercicio01 {

  public static boolean numeroP(int num1) {
    int soma = 0;
     for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                soma += i;
            }
        }
       
       
        return soma == num1;
    }


    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
       
        System.out.println("Digite um número inteiro para ver se é perfeito:");
        int num2= ler.nextInt();

       
        if (numeroP(num2)) {
            System.out.println(num2 + " é um número perfeito.");
        } else {
            System.out.println(num2 + " não é um número perfeito.");
        }  
    }
   
}