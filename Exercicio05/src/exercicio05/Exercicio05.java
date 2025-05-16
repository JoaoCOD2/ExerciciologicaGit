
package exercicio05;
public class Exercicio05 {

    public static long calculoF (int num) {
        if (num < 0){
            System.out.println("Não existe fatorial de um numero negativo");
            return -1;
        }
        
        long fatorial = 1;
        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main (String [] args) {
        int num = 20;
        long resultado = calculoF(num);
        
        if (resultado != -1){
            System.out.println("O fatorial de " + num + "é " + resultado);
        }
    }
}
