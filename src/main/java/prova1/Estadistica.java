package prova1;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by xavi on 18/03/18.
 */
public class Estadistica {

    static int[] mostres = new int[]{12,34,1,6,45,78,4,5,34,6,9,2,6,5,76,91,56,33,62,90,10,47,42,40};

    public static void doIt() {

        /** NO CONTROLAM APOSTA EL TAMANY DE MOSTRES PER TAL DE DEMOSTRAR
         * LA PROPAGACIÓ D'ERRORS O LA PROVOCACIÓ DELS MATEIXOS PER
         * USUARIS EXTERNS A LA CLASSE
         */

        mostres = filter(mostres);
        int mostresMayors10 = 0;

        System.out.println("Mostres filtrades:");
        for(int mostra : mostres){
            if (mostra > 10) mostresMayors10++;
            System.out.print("mostra:");
            System.out.println(mostra);
        }

        System.out.println("Numero de mostres > 10:" + mostresMayors10);

    }

    public static int[] filter(int[] mostres){
        // Anem a filtrar els elements
        for (int i=0; i < mostres.length; i++){

            if (mostres[i] % 2 == 0){
                mostres = ArrayUtils.remove(mostres, i);
            }
        }

        return mostres;
    }

    public static int operacioMatematica() {

        int suma = 0;
        for (int i = 0; i< mostres.length; i++){
            suma += mostres[i];
        }

        return suma;
    }
}
