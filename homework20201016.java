package sk.deco.keakademia.homework20201016;

import java.util.ArrayList;

public class homework20201016 {
    public static void main(String[] args) {

        /*1. Zadame text do premennej, napr. String text = "SKOLA".
             Program vypise na obrazovku:
        SKOLA
        KOLA
        OLA
        LA
        A*/
        String text="SKOLA";
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j+i < text.length(); j++) {
                System.out.print(text.charAt(i + j));
            }
            System.out.println();
        }

        /*2. Vypiste vsetky cisla 8X75Y2, kde X a Y nahradite cislicami tak,
        aby zadane cislo bolo delitelne cislom 91.*/
        int a=807502;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                a=807502+x*10000+y*10;
                if (a%91==0) System.out.println();
            }
        }

        /*3. Urobte program, ktory spocita kolko je:
        1 + 1/2+ 1/3 + 1/4 + 1/5+ 1/6 +..........+1/98+1/99+1/100*/
        double x=1;
        double sum=0;
        for (int i = 1; i < 101; i++) {
            sum=sum+x/i;
        }
        System.out.println(sum);

        /*Bonusova DU:

        Vytvorit pole s nazvom keno:
        int[] keno = new int[20];
        urobit cyklus, ktory naplni pole 20 nahodnymi cislami od 1 do 80.
        Pozor, cisla sa nesmu opakovat, cize pri generovani pola , napr. 7 csidla v poradi
        musime urobit kontrolu ci uz take cislo neexistuje,
        Ak nie, zapiseme ho a ideme na 8 prvok, an ano, generujeme znova.*/

        int[] keno=new int[20];
        ArrayList<Integer> kenoList=new ArrayList<>();
        int i=0;
        do {
            int random= (int) (Math.random()*80+1);
            boolean randomExists=kenoList.contains(random);
            if (!randomExists) {
                keno[i] = random;
                kenoList.add(random);
            }
            else continue;
            i++;
        }while(i<20);

        for (int j:keno) {
            System.out.print(j+" ");
        }

        //TODO ask why at line57 <Integer> with capital I??

        for (int j = 65; j < 127; j++) {
            System.out.println(j+":"+" "+(char)j);
        }
    }
}
