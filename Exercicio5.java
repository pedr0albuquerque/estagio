/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.pi.exercicio5;

/**
 *
 * @author pedro
 */
public class Exercicio5 {

    public static void main(String[] args) {
        String palavra = "melancia";
        String[] palavraDividida = palavra.split("");
        
        for(int i = palavraDividida.length; i > 0; i--){
            System.out.println(palavraDividida[i-1]);
        }
    }
}
