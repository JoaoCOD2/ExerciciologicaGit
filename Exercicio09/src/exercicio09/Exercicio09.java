//atualização commit
package exercicio09;
public class Exercicio09 {
public static double calcularPorcentagem(double total, double porcentagem) {
        return (total * porcentagem) / 100.0;
    }

    public static void main(String[] args) {
        double total = 500.0;
        double porcentagem = 20.0;

        double resultado = calcularPorcentagem(total, porcentagem);
        System.out.println(porcentagem + "% de " + total + " é: " + resultado);
    }
}