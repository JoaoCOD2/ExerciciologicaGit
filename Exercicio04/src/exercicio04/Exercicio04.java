
package exercicio04;
public class Exercicio04 {

    public static String stringVog(String[] array) {
        String resultado = "";
        int maxV = 0;
        
        for (String str : array){
            int contagem = contarVogais(str);
            if (contagem > maxV){
                resultado = str;
            }
        }
        return resultado;
    }
    private static int contarVogais (String str){
        int contagem = 0;
        str = str.toLowerCase();
        
        for (char c : str.toCharArray()){
            if ("aeiaou".indexOf (c) != -1){
                contagem ++;
            }
        }
        return contagem;
    }
    
    public static void main (String[] args){
        String [] palavras = {"java", "python", "html", "correr"};
        String resultado = stringVog (palavras);
        System.out.println("A palavra com mais vogais: " + resultado);
    }
}
