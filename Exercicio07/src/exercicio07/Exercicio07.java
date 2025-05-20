
package exercicio07;
public class Exercicio07 {
public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return Math.abs(a); // garante que o resultado seja sempre positivo
    }
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        System.out.println("MDC de " + num1 + " e " + num2 + " é: " + calcularMDC(num1, num2));
    }
} //troço do capeta

