/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication393;

import java.util.Random;
import static javaapplication393.JavaApplication393.gerarNumeroAleatorio;

/**
 *
 * @author aluno.saolucas
 */
public class JavaApplication393 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Números da sorte de hoje:" + gerarNumeroAleatorio());
        }
        String hoje = obterDataHoraAtual();
        System.out.println(hoje);
        for (int i = 1; i <= 6; i++) {
            System.out.println(obterMen(1));
        }
        System.out.println("mensagem do dia:"+obterMen(gerarNumeroAleatorio()));
        
    }

    public static int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static String obterDataHoraAtual() {
        return java.time.LocalDateTime.now().toString();
    }

    public static String obterMen(int op) {
        String men;
        switch (op) {
            case 1:
                men = "Fica em casa";
                break;
            case 2:
                men = "Bora beber uma:)";
                break;
            case 3:
                men = "Pague sua conta caloteiro";
                break;
            case 4:
                men = "Dia do sofá";
                break;
            case 5:
                men = "Corre, hora do churras";
                break;
            default:
                men = "Vai achar o que fazer, xiru)";
        }//fim switch
        return men;
    }
}
