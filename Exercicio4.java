/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.pi.exercicio4;

/**
 *
 * @author pedro
 */
public class Exercicio4 {

    public static void main(String[] args) {
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53; 
        double total = sp+mg+rj+es+outros;
        double porcentagemSP = (sp/total) * 100;
        double porcentagemRJ = (rj/total) * 100;
        double porcentagemMG = (mg/total) * 100;
        double porcentagemES = (es/total) * 100;
        double porcentagemOutros = (outros/total) * 100;
        
        System.out.println("SP "+porcentagemSP);
        System.out.println("RJ "+porcentagemRJ);
        System.out.println("MG "+porcentagemMG);
        System.out.println("ES "+porcentagemES);
        System.out.println("Outros "+porcentagemOutros);
    }
}
