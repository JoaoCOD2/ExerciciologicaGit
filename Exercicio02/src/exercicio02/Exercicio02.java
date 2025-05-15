
package exercicio02;
public class Exercicio02{
    public static String substituiV(String texto){
        char [] resultado = new char [texto.length()];
        
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                resultado [i] = '*';
        }else{
          resultado [i] = c;
         }  
    } 
        String novaStrg = "";
        for ( int i = 0; i < resultado.length; i++){
            novaStrg += resultado[i];
        }
        return novaStrg;
}  
public static void main (String[] args){
    String org = "Java";
    String mod = substituiV(org);
    System.out.println("A palavra original é " + org);
    System.out.println("A palavra com * no lugar das vogais é " + mod);
 }
}