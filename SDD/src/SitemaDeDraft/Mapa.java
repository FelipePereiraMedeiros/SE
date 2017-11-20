/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SitemaDeDraft;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaspe
 */
public class Mapa {
    
    private String nome;
    
    /*Herois Disponiveis*/
    private ArrayList <Heroi> herois = null;
    
    /*Composição Hard Engage*/
    private ArrayList <Heroi> Comp = null;
    
    /*Picks Vermelho*/
    private ArrayList <Heroi> PV = null;
    
    /*Picks Azul*/
    private ArrayList <Heroi> PA = null;
    
    public Mapa(String nome,String fileHerois, String fileComp) throws IOException {
        this.nome = nome;
        inicializarHerois(fileHerois,fileComp);
    }
    
    public void inicializarHerois(String fileHerois, String fileComp) throws FileNotFoundException, IOException{
        BufferedReader br = null;
        String line = "";
        String csvSplitby = ",";
        int i = 0;
        Heroi tempHero = null;
        this.herois = new ArrayList<Heroi>();
        this.Comp = new ArrayList<Heroi>();
        try{
            br = new BufferedReader(new FileReader(fileHerois));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] h = line.split(csvSplitby);
                tempHero = new Heroi(Integer.parseInt(h[0]),h[1],h[2],h[3],h[4]);
                this.herois.add(tempHero);
                i++;
            }
            
            System.out.println("---------------------------");
            i = 0;
            br = new BufferedReader(new FileReader(fileComp));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] l = line.split(csvSplitby);
                tempHero = new Heroi(Integer.parseInt(l[0]),l[1],l[2],l[3],l[4]);
                this.Comp.add(tempHero);
                i++;
            }
        }catch(FileNotFoundException e){
        }catch(IOException e){
        }finally{
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }        
        }
    
    
    
}