//Atualização commit
package exercicio10;
public class Exercicio10 {
 public static boolean ehFibonacci(int n) {
       return ehQuadradoPerfeito(5 * n * n + 4) || ehQuadradoPerfeito(5 * n * n - 4);
    }
    private static boolean ehQuadradoPerfeito(int x) {
        int raiz = (int) Math.sqrt(x);
        return raiz * raiz == x;
    }
    public static void main(String[] args) {
        int numero = 21;
        System.out.println(numero + " pertence à sequência de Fibonacci? " + ehFibonacci(numero));
    }
}