/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SitemaDeDraft;

/**
 *
 * @author Gaspe
 */
public class Heroi {
   private int id;
   private String nome;
   private String classe;
   private String mundo;
   private String funcao;
   
    public Heroi(int id, String nome, String classe, String mundo, String funcao) {
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.mundo = mundo;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getMundo() {
        return mundo;
    }

    public String getFuncao() {
        return funcao;
    }
    
    
}