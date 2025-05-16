
package exercicio.pkg06;
public class Exercicio06 {
    public static boolean palindromo(String texto) {
        String limpa = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != ' ') {
                limpa += Character.toLowerCase(c);
            }
        }
        int esquerda = 0;
        int direita = limpa.length() - 1;

        while (esquerda < direita) {
            if (limpa.charAt(esquerda) != limpa.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Radar: " + palindromo("Radar"));          
        System.out.println("Deified: " + palindromo("Deified"));      
        System.out.println("Amo Roma: " + palindromo("Amo Roma"));    
        System.out.println("Não é: " + palindromo("Não é"));  
    }
}