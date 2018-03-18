package prova1;

import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;
import prova1.Estadistica;

/**
 * Created by xavi on 18/03/18.
 */
public class Main {



    public static void main(String[] args) {

        System.out.println("Introdueix algunes mostres més separades per , :");
        Scanner reader = new Scanner(System.in);

        String mostresStr = reader.next();

        String[] mostres = mostresStr.split("[,]");

        for (String mostra : mostres){
            ArrayUtils.add(Estadistica.mostres,Integer.parseInt(mostra));
        }


        int[] novesMostres = Estadistica.filter(Estadistica.mostres);
        Estadistica.mostres = novesMostres;

        System.out.print("SUMA:");
        System.out.println(Estadistica.operacioMatematica());

        Estadistica.mostres = null;

        Estadistica.doIt();


    }
}
