package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        int[]laud={1,0,0,1,1,1,0,0,1,0};
        Scanner kasutaja=new Scanner(System.in);

        while (gameover(laud)) {
            System.out.println("Sisesta üks nr");
            int sisestus=kasutaja.nextInt();
            int hit=laud[sisestus];
            if(hit==0){
                System.out.println("mööda");
            } else if (hit==1){

                System.out.println("pihtas");
                laud[sisestus]=2;
            } else if (hit==2) {
                System.out.println("juba proovisid");
            }
        }
        System.out.println("võitsid");
    }
    public static boolean gameover(int[]laud){
        for (int i=0;i<laud.length;i++) {
            if (laud[i]==1){
                return true;
            }
        }
        return false;
    }
}
