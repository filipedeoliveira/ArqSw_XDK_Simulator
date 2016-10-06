package xdk_simulator;

import java.util.Random;

public class XDK_Simulator {

    public static String getTemperatura() {
        float minT = -20.0f;
        float maxT = 60.0f;
        String temperatura;
        Random randT = new Random();

        temperatura = "Temperatura: " + Float.toString(randT.nextFloat() * (maxT - minT)) + minT + "ºC";
        //System.out.println("A temperatura é: %.2f " + temperatura);
        return temperatura;

    }

    public static String getPressao() {
        float minP = 300f;// ver intervalo de valores
        float maxP = 1100.0f;
        String pressao;
        Random randP = new Random();

        pressao = "Pressão: " + Float.toString(randP.nextFloat() * (maxP - minP) + minP) + "hPa";
        //System.out.println("A pressão é: %.2f  " + pressao);
        return pressao;
    }

    public static String getHumidade() {
        float minH = 10f;// humidade em percentagem 
        float maxH = 90f;
        String humidade;
        Random randH = new Random();

        humidade = "Humidade: " + Float.toString(randH.nextFloat() * (maxH - minH) + minH) + "%rH";
        //System.out.println("A humidade é: %.2f " + humidade);
        return humidade;
    }

    public static String getLuz() {
        float minL = 0.045f;// ver intervalo de valores
        float maxL = 188000.0f;
        String luz;
        Random randL = new Random();

        luz = "Luz: " + Float.toString(randL.nextFloat() * (maxL - minL) + minL)+"lux";
        //System.out.println("A intensidade de Luz é: %.2f " + luz);
        return luz;
    }

    public static String getAcustica() {
        float minA = 125.0f;// ver intervalo de valores
        float maxA = 4000.0f;
        String acustica;
        Random randA = new Random();

        acustica = "Acustica: " + Float.toString(randA.nextFloat() * (maxA - minA) + minA) + "Hz";
        //System.out.println("A acústica é: %.2f " + acustica);
        return acustica;
    }

    public static String getAcelerometro() {
        float minAc = -2.0f;// ver intervalo de valores
        float maxAc = 16.0f;
        String acelerometro;
        Random randAc = new Random();

        acelerometro = "Aceleração: " + Float.toString(randAc.nextFloat() * (maxAc - minAc) + minAc) + "g";
        //System.out.println("A aceleraçãp é: %.2f " + acelerometro);
        return acelerometro;
    }

    public static String getGiroscopio() {
        float minG = -125.0f;// ver intervalo de valores
        float maxG = 2000.0f;
        String giroscopio;
        Random randG = new Random();

        giroscopio = "Giroscópio: " + Float.toString((randG.nextFloat() * (maxG - minG) + minG)) + "º/s";
        //System.out.println("A horientaçã é: %.2f " + giroscopio);
        return giroscopio;
    }

    public static String getMagnetometro() {
        float minX = -1300.0f;
        float maxX = 1300.0f;
        float minY = -1300.0f;
        float maxY = 1300.0f;
        float minZ = -2500.0f;
        float maxZ = 2500.0f;
        String magnetometro;
        Random randX = new Random();
        Random randY = new Random();
        Random randZ = new Random();

        magnetometro = "Magnetometro: " + Float.toString(randX.nextFloat() * (maxX - minX) + minX) + "X , " + Float.toString(randY.nextFloat() * (maxY - minY) + minY) + "Y , " + Float.toString(randZ.nextFloat() * (maxZ - minZ) + minZ) + "Z";
        //System.out.println("A magneterização é: %.2f " + magnetometro);
        return magnetometro;
    }

}
