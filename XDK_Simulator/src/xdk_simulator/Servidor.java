/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdk_simulator;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Stéphane
 */

public class Servidor {
    
    public static void main(String[] args) throws IOException {
     // inicia o servidor
     new Servidor(12345).executa();
   }
   
   private int porta;
   private List<PrintStream> clientes;
   
   public Servidor (int porta) {
     this.porta = porta;
     this.clientes = new ArrayList<PrintStream>();
   }
   
   public void executa () throws IOException {
     ServerSocket servidor = new ServerSocket(this.porta);
     System.out.println("Porta 12345 aberta!");
     
     while (true) {
       // aceita um cliente
       Socket cliente = servidor.accept();
       System.out.println("Nova conexão com o cliente " +   
         cliente.getInetAddress().getHostAddress()
       );
       
       // adiciona saida do cliente à lista
       PrintStream ps = new PrintStream(cliente.getOutputStream());
       this.clientes.add(ps);
       
       
       // cria tratador de cliente numa nova thread
       TrataCliente tc = 
           new TrataCliente(cliente.getInputStream(), this);
            new Thread(tc).start();
            
          
     }
 
   }
   
   
    public void distribuiMensagem(String msg) {
     // envia msg para todo mundo
     for (PrintStream cliente : this.clientes) {
       cliente.println(msg);
     }
    }
    

    public static void FuncAux(){
    int min= 1;
    int max=8;
    float result;
    Random rand = new Random();
    
     while(true) {
    int randomNum = rand.nextInt((max - min) + 1) + min;
    
	switch (randomNum) {
            case 1:  result = XDK_Simulator.getAcelerometro();
                    System.out.println("A aceleração é: %.2f " + result);
                     break;
            case 2:  result = XDK_Simulator.getGiroscopio();
                    System.out.println("A horientação é: %.2f " + result);
                     break;
            case 3:  result = XDK_Simulator.getMagnetometro();
                    System.out.println("A magneterização é: %.2f " + result);
                     break;
            case 4:  result = XDK_Simulator.getHumidade();
                    System.out.println("A humidade é: %.2f " + result);
                     break;
            case 5:  result = XDK_Simulator.getPressao();
                    System.out.println("A pressão é: %.2f  " + result);
                     break;
            case 6:  result = XDK_Simulator.getTemperatura();
                    System.out.println("A temperatura é: %.2f " + result);
                     break;
            case 7:  result = XDK_Simulator.getAcustica();
                    System.out.println("A acústica é: %.2f " + result);
                     break;
            case 8:  result = XDK_Simulator.getLuz();
                    System.out.println("A intensidade de Luz é: %.2f " + result);
                     break;
        }
    try {
        Thread.sleep(5000);
    } catch (InterruptedException ex) {
         System.out.println("ERRO");
    }
    }
}
 
    
}