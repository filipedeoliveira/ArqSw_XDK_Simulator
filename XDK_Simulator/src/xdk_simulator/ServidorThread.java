/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdk_simulator;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stéphane
 */
public class ServidorThread extends Thread{
 
    public void run(){
        
       while (Servidor.clientes.isEmpty());
       
       PrintStream saida;
       while (true){
           try {
               for( Socket s : Servidor.clientes)
                   try {
                       saida = new PrintStream(s.getOutputStream());
                       saida.println(Float.toString(Servidor.MYVALUE));
                   } catch (IOException ex) {
                       System.out.println("ERRO");
                   }
               sleep(5000);
              
           } catch (InterruptedException ex) {
               Logger.getLogger(ServidorThread.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}
