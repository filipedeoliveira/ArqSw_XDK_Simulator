/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdk_simulator;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 *
 */
public class Cliente {

    public static void main(String[] args) throws UnknownHostException, IOException {
        // dispara cliente
        new Cliente("127.0.0.1", 12345).executa();
    }

    private String host;
    private int porta;

    public Cliente(String host, int porta) {
        this.host = host;
        this.porta = porta;
    }

    public String getHost() {
        return this.host;
    }

    public int getPorta() {
        return this.porta;
    }

    public void executa() throws UnknownHostException, IOException {
        Socket cliente = new Socket(this.host, this.porta);
        System.out.println("O cliente conectou se ao servidor!");

        // thread para receber mensagens do servidor
        Scanner scanner = new Scanner(cliente.getInputStream());
        while (!scanner.hasNextLine());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        cliente.close();
    }
}
