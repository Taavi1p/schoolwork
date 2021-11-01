//Taavi Tammaru
// 12a programmeerimine
// 26.13.1998

import java.util.*;
import java.io.*;

public class Kontrolltöö {

    public static int mängija(String nimi) {

        if (nimi.equals("Mats")) {
            return 0;
        }
        else if (nimi.equals("Maria")) {
            return 1;
        }
        else if (nimi.equals("Karl")) {
            return 2;
        }
        else if (nimi.equals("Fredi")) {
            return 3;
        }
        else  {
            return 4;
        }
    }

    public static int punktid(String skoor) {

        String skoor_listina[];
        skoor_listina = skoor.split("");
        if (Integer.parseInt(skoor_listina[1]) > Integer.parseInt(skoor_listina[3])) {
            return 2;
        }
        else if (Integer.parseInt(skoor_listina[1]) < Integer.parseInt(skoor_listina[3])){
            return 0;
        }
        else {
            return 1;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        File fail = new File("/Users/kadripoldmaa/IdeaProjects/schoolwork/kordamine/src/Alagrupp (1).txt");
        Scanner file_reader = new Scanner(fail);

        int maatriks[][] = new int[5][5];



        while( file_reader.hasNextLine()) {

            int esimene_mängija = -1;
            int teine_mängija = -1;

            int esimese_mängija_punktid = -1;



            String rida_listina[];

            String rida = file_reader.nextLine();
            rida_listina = rida.split(" ");

            //kes mängivad


            esimene_mängija = mängija(rida_listina[0]);
            teine_mängija = mängija(rida_listina[2]);

            //kes võitis

            esimese_mängija_punktid = punktid(rida_listina[3]);


            //punktide jagamine

            maatriks[esimene_mängija][teine_mängija] = esimese_mängija_punktid;
            if (esimese_mängija_punktid == 0) {
                maatriks[teine_mängija][esimene_mängija] = 2;
            }
            else if (esimese_mängija_punktid == 2) {
                maatriks[teine_mängija][esimene_mängija] = 0;
            }
            else {
                maatriks[teine_mängija][esimene_mängija] = 1;
            }


        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(maatriks[i][j] + " ");
            }
            System.out.println();
        }

    }
}
