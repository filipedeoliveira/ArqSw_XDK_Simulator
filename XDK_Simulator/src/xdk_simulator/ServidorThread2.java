/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdk_simulator;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorThread2 extends Thread {

    public static String FuncAux() {
        int min = 1;
        int max = 8;
        String result = "";
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        switch (randomNum) {
            case 1:
                result = XDK_Simulator.getAcelerometro();
                //System.out.println("A aceleração é: %.2f " + result);
                break;
            case 2:
                result = XDK_Simulator.getGiroscopio();
                //result = XDK_Simulator.getGiroscopio();
                //System.out.println("A horientação é: %.2f " + result);
                break;
            case 3:
                result = XDK_Simulator.getMagnetometro();
                //System.out.println("A magneterização é: %.2f " + result);
                break;
            case 4:
                result = XDK_Simulator.getHumidade();
                //System.out.println("A humidade é: %.2f " + result);
                break;
            case 5:
                result = XDK_Simulator.getPressao();
                //System.out.println("A pressão é: %.2f  " + result);
                break;
            case 6:
                result = XDK_Simulator.getTemperatura();
                //System.out.println("A temperatura é: %.2f " + result);
                break;
            case 7:
                result = XDK_Simulator.getAcustica();
                //System.out.println("A acústica é: %.2f " + result);
                break;
            case 8:
                result = XDK_Simulator.getLuz();
                //System.out.println("A intensidade de Luz é: %.2f " + result);
                break;
        }

        return result;
    }

    public void run() {

        while (true) {
            Servidor.MYVALUE = FuncAux();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ServidorThread2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
