package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("ALGUS");
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);
        vertikaalne(foor1);
        vertikaalne(foor2);
        horisontaalne(foor3);
        horisontaalne(foor4);
    }
    public void vertikaalne(Foor foor){
        System.out.println("VERT");
        for(int o=0; o<5;o=o+1) {
            System.out.println("VERT tsükkel");
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.paus(0.5);
            foor.vahetaPunast();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
        }
    }
    public void horisontaalne(Foor foor){
        for(int z=0; z<5;z=z+1){
        foor.vahetaPunast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();}
    }
}
