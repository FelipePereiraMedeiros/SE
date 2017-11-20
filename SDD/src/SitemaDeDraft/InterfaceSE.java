/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SitemaDeDraft;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gaspe
 */
public class InterfaceSE {
    
    private int resposta = -1;
    private String respostaS = "";
    private int[] respostasF = new int[3];
    
    public void Interface() throws IOException{
        int i = 0;
        Scanner scr = new Scanner (System.in);
        while(resposta != 1 & resposta != 2){
            System.out.println("Quem começa banindo?\n1-Time Azul\n2-Time Vermelho\n");
            resposta = scr.nextInt();
            respostasF[i] = resposta;
        }
        i++;
        resposta = -1;
        while(resposta != 1){
            System.out.println("Qual Mapa esta selecionado?\n1-Baia do Coracao Negro\n");
            resposta = scr.nextInt();
            respostasF[i] = resposta;
        }
        i++;
        resposta = -1;
        while(resposta !=1){
            System.out.println("Qual a composição que deseja montar?\n1-Hard Engage");
            resposta = scr.nextInt();
            respostasF[i] = resposta;
        }
        if(respostasF[1] == 1){
            if (respostasF[2] == 1) {
                Mapa mp = new Mapa("Baia Do Coração Negro","C:\\Users\\Gaspe\\Documents\\NetBeansProjects\\SDD\\src\\SitemaDeDraft\\Herois.csv","C:\\Users\\Gaspe\\Documents\\NetBeansProjects\\SDD\\src\\SitemaDeDraft\\HE - Baia.csv");
                
            }
        }    
    }
}
