
//12 a programmeerimine
// Taavi Tammaru
// 25.10.2021

import java.util.*;
import java.io.*;

public class KontrolltööTaaviTammaru {


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
        else if (nimi.equals("Lembit")) {
            return 4;
        }
        else {
            return -1;
        }
    }

    public static int punktid (String skoor) {
        String[] skoor_listina;
        skoor_listina = skoor.split("");
        if (Integer.parseInt(skoor_listina[1]) > Integer.parseInt(skoor_listina[3])) {
            return 2;
        }
        else if (Integer.parseInt(skoor_listina[1]) < Integer.parseInt(skoor_listina[3])) {
            return 0;
        }
        else {
            return 1;
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        File fail = new File("/Users/kadripoldmaa/IdeaProjects/schoolwork/kordamine/src/Alagrupp (1).txt");
        Scanner fileReader = new Scanner(fail);

        int[][] maatriks = new int[5][5];

        while (fileReader.hasNextLine()) {

            int esimene_player = -1;
            int teine_player = -1;

            int esimene_player_punktid = 0;

            String ridaListina[];
            String rida = fileReader.nextLine();

            ridaListina = rida.split(" ");


            //kes mängivad

            esimene_player = mängija(ridaListina[0]);
            teine_player = mängija(ridaListina[2]);


            //kes võitis mängu
            esimene_player_punktid = punktid(ridaListina[3]);

            //punktide jagamine

            maatriks[esimene_player][teine_player] = esimene_player_punktid;
            if (esimene_player_punktid == 2) {
                maatriks[teine_player][esimene_player] = 0;
            }
            else if (esimene_player_punktid == 0) {
                maatriks[teine_player][esimene_player] = 2;
            }
            else {
                maatriks[teine_player][esimene_player] = 1;
            }

        }

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks.length; j++) {
                System.out.print(maatriks[i][j] + " ");
            }
            System.out.println();
        }

        int best_score = 0;

        for (int i = 0; i < 5; i++) {
            int score = 0;
            for (int j = 0; j < 5; j++) {
                score += maatriks[i][j];
            }
            if (score > best_score) {
                best_score = i;
            }
        }

        if (best_score == 1) {
            System.out.println("võitja on Mats");
        }
        else if (best_score == 2) {
            System.out.println("võitja on Maria");
        }
        else if (best_score == 3) {
            System.out.println("võitja on Karl");
        }
        else if (best_score == 4) {
            System.out.println("võitja on Fredi");
        }
        else if (best_score == 5) {
            System.out.println("võitja on Lembit");
        }

    }
}
