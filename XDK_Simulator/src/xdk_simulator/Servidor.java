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

    static volatile float MYVALUE;

    public static void main(String[] args) throws IOException {
        // inicia o servidor
        new Servidor(12345).executa();
    }

    private int porta;
    public static volatile List<Socket> clientes;

    public Servidor(int porta) {
        this.porta = porta;
        this.clientes = new ArrayList<Socket>();
    }

    public void executa() throws IOException {
        ServerSocket servidor = new ServerSocket(this.porta);
        System.out.println("Porta 12345 aberta!");
        int porta = 0;

        ServidorThread mensageiro = new ServidorThread();
        mensageiro.start();
        ServidorThread2 atualizador = new ServidorThread2();
        atualizador.start();
        while (true) {
            // aceita um cliente

            Socket cliente = servidor.accept();
            System.out.println("Nova conexão com o cliente " + porta);
            porta++;

            clientes.add(cliente);
            clientes.size();

        }

    }

}
