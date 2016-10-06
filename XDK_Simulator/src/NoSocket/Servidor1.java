/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoSocket;

import java.util.ArrayList;

/**
 *
 * @author Filipe Oliveira
 */
public class Servidor1 {

    private static ArrayList<Cliente1> clientes1 = new ArrayList();

    public void main(String[] args) {

        try {
            this.func();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void func() {
        int i;
        for (i = 0; i < 5; i++) {
            this.clientes1.add(new Cliente1(i));
        }
        for (Cliente1 c : clientes1) {
            c.call_XDK();
        }
    }

}
