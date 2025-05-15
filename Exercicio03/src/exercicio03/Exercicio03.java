
package exercicio03;
public class Exercicio03 {
    public static int maiorV(int [] array) {
        if (array == null || array.length == 0){
            return 0;
        }
      
        int maiorab = Math.abs(array[0]);
        for (int i = 1; i< array.length; i++){
            int valorab = Math.abs(array[i]);
            if (valorab > maiorab){
                maiorab = valorab;
            }
        }
        return maiorab;
    }
    
    public static void main (String[] args){
        int [] numeros = {-12, 4, 0, 43, 56, 98, -9};
        int resultado = maiorV(numeros);
        System.out.println("O maior valor é " + resultado);
    }
}
