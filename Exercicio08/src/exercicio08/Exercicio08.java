
package exercicio08;
public class Exercicio08 {
public static int[] inverter(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] resultado = inverter(original);

        System.out.print("Array invertido: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
