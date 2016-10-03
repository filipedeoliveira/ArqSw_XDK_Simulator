package xdk_simulator;

import java.util.Random;

public class XDK_Simulator {

    public static String getTemperatura() {
        float minT = -7.0f;
        float maxT = 42.0f;
        String temperatura;
        Random randT = new Random();

        temperatura = "Temperatura: " + Float.toString(randT.nextFloat() * (maxT - minT) + minT);
        //System.out.println("A temperatura é: %.2f " + temperatura);
        return temperatura;

    }

    public static String getPressao() {
        float minP = 0f;// ver intervalo de valores
        float maxP = 1100.0f;
        String pressao;
        Random randP = new Random();

        pressao = "Pressão: " + Float.toString(randP.nextFloat() * (maxP - minP) + minP);
        //System.out.println("A pressão é: %.2f  " + pressao);
        return pressao;
    }

    public static String getHumidade() {
        float minH = 0f;// humidade em percentagem 
        float maxH = 100f;
        String humidade;
        Random randH = new Random();

        humidade = "Humidade: " + Float.toString(randH.nextFloat() * (maxH - minH) + minH);
        //System.out.println("A humidade é: %.2f " + humidade);
        return humidade;
    }

    public static String getLuz() {
        float minL = -7.0f;// ver intervalo de valores
        float maxL = 42.0f;
        String luz;
        Random randL = new Random();

        luz = "Luz: " + Float.toString(randL.nextFloat() * (maxL - minL) + minL);
        //System.out.println("A intensidade de Luz é: %.2f " + luz);
        return luz;
    }

    public static String getAcustica() {
        float minA = -7.0f;// ver intervalo de valores
        float maxA = 42.0f;
        String acustica;
        Random randA = new Random();

        acustica = "Acustica: " + Float.toString(randA.nextFloat() * (maxA - minA) + minA);
        //System.out.println("A acústica é: %.2f " + acustica);
        return acustica;
    }

    public static String getAcelerometro() {
        float minAc = -7.0f;// ver intervalo de valores
        float maxAc = 42.0f;
        String acelerometro;
        Random randAc = new Random();

        acelerometro = "Aceleração: " + Float.toString(randAc.nextFloat() * (maxAc - minAc) + minAc);
        //System.out.println("A aceleraçãp é: %.2f " + acelerometro);
        return acelerometro;
    }

    public static String getGiroscopio() {
        float minG = -7.0f;// ver intervalo de valores
        float maxG = 42.0f;
        String giroscopio;
        Random randG = new Random();

        giroscopio = "Giroscópio: " + Float.toString((randG.nextFloat() * (maxG - minG) + minG));
        //System.out.println("A horientaçã é: %.2f " + giroscopio);
        return giroscopio;
    }

    public static String getMagnetometro() {
        float minMg = -7.0f;// ver intervalo de valores
        float maxMg = 42.0f;
        String magnetometro;
        Random randMg = new Random();

        magnetometro = "Magnetometro: " + Float.toString(randMg.nextFloat() * (maxMg - minMg) + minMg);
        //System.out.println("A magneterização é: %.2f " + magnetometro);
        return magnetometro;
    }

}
