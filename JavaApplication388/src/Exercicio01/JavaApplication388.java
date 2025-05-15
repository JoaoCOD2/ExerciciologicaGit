
package Exercicio01;
public class JavaApplication388 {

    public static boolean numeroPerfeito(int num) {
        if (num <= 1){
            return false;
        }
     
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                soma += i;
            }
        }
        return soma == num;
    }
    public static void main (String[] args){
     System.out.println (numeroPerfeito(28));
     System.out.println (numeroPerfeito(4));
     System.out.println (numeroPerfeito(12));
     System.out.println (numeroPerfeito(6));
    }
    
}
