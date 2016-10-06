/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoSocket;

import java.util.ArrayList;

public class Cliente1 {

    private int user;

    public Cliente1(int user) {
        this.user = user;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public void call_XDK() {
        Simulador.FuncAux();
    }
}
