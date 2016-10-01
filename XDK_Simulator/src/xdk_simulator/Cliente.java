/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdk_simulator;

/**
 *
 * 
 */
public class Cliente {
    
    private String nome;
    

    public Cliente() {
        this.nome = "";
    }

    public Cliente(String no) {
        this.nome = no;    
    }

    public Cliente(Cliente cl) {
        this.nome = cl.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
}
