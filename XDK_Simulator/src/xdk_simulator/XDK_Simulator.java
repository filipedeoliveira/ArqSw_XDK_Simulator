/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xdk_simulator;

import java.util.Random;

/**
 *
 * @author Filipe Oliveira
 */
public class XDK_Simulator {

    public static float getTemperatura() {
        float minT = -7.0f;
        float maxT = 42.0f;
        float temperatura;
        Random randT = new Random();

        temperatura = randT.nextFloat() * (maxT - minT) + minT;
        System.out.println("A temperatura é: %.2f " + temperatura);
        return temperatura;

    }

    public static float getPressao() {
        float minP = 0f;// ver intervalo de valores
        float maxP = 1100.0f;
        float pressao;
        Random randP = new Random();

        pressao = randP.nextFloat() * (maxP - minP) + minP;
        System.out.println("A pressão é: %.2f  " + pressao);
        return pressao;
    }

    public static float getHumidade() {
        float minH = 0f;// humidade em percentagem 
        float maxH = 100f;
        float humidade;
        Random randH = new Random();

        humidade = randH.nextFloat() * (maxH - minH) + minH;
        System.out.println("A humidade é: %.2f " + humidade);
        return humidade;
    }

    public static float getLuz() {
        float minL = -7.0f;// ver intervalo de valores
        float maxL = 42.0f;
        float luz;
        Random randL = new Random();

        luz = randL.nextFloat() * (maxL - minL) + minL;
        System.out.println("A intensidade de Luz é: %.2f " + luz);
        return luz;
    }

    public static float getAcustica() {
        float minA = -7.0f;// ver intervalo de valores
        float maxA = 42.0f;
        float acustica;
        Random randA = new Random();

        acustica = randA.nextFloat() * (maxA - minA) + minA;
        System.out.println("A acústica é: %.2f " + acustica);
        return acustica;
    }

    public static float getAcelerometro() {
        float minAc = -7.0f;// ver intervalo de valores
        float maxAc = 42.0f;
        float acelerometro;
        Random randAc = new Random();

        acelerometro = randAc.nextFloat() * (maxAc - minAc) + minAc;
        System.out.println("A aceleraçãp é: %.2f " + acelerometro);
        return acelerometro;
    }

    public static float getGiroscopio() {
        float minG = -7.0f;// ver intervalo de valores
        float maxG = 42.0f;
        float giroscopio;
        Random randG = new Random();

        giroscopio = randG.nextFloat() * (maxG - minG) + minG;
        System.out.println("A horientaçã é: %.2f " + giroscopio);
        return giroscopio;
    }

    public static float getMagnetometro() {
        float minMg = -7.0f;// ver intervalo de valores
        float maxMg = 42.0f;
        float magnetometro;
        Random randMg = new Random();

        magnetometro = randMg.nextFloat() * (maxMg - minMg) + minMg;
        System.out.println("A magneterização é: %.2f " + magnetometro);
        return magnetometro;
    }

}
