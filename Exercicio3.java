/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.pi.exercicio3;

/**
 *
 * @author pedro
 */
public class Exercicio3 {

    public static void main(String[] args) {
        double valorMaior = 0, valorMenor = 0;
        double[] dias = {31490.7866,37277.9400,37708.4303,0.0000,0.0000,17934.2269,0.0000,6965.1262,24390.9374,14279.6481,0.0000,0.0000,39807.6622,27261.6304,39775.6434,29797.6232,17216.5017,0.0000,0.0000,12974.2000,28490.9861,8748.0937,8889.0023,17767.5583,0.0000,0.0000,3071.3283,48275.2994,10299.6761,39874.1073};
        for(int i = 0; i < dias.length; i++){
            if(dias[i]>0){
                if(valorMaior<dias[i]){
                    valorMenor = valorMaior;
                    valorMaior = dias[i];
                    
                }else{
                    valorMaior = dias[i];
                }
            }
        }
        System.out.println("Maior "+valorMaior);
        System.out.println("Menor "+valorMenor);
    }
}
