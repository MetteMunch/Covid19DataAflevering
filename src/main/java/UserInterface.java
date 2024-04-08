import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {

    FileHandler instanceOfFileHandler;
    Scanner consolInput;

    public UserInterface() {
        instanceOfFileHandler = new FileHandler();
        consolInput = new Scanner(System.in);
        startProgram();
    }

    public void startProgram() {
        int SENTINEL = 6;
        int userInput = -1;




        while (userInput != SENTINEL) {
            menu();
            userInput = consolInput.nextInt();


            switch (userInput) {
                case 1:
                    sortRegion();
                    break;



                case 2:
                    sortAlder();
                    break;



                case 3:
                    sortFlere();
                    break;


                case 4:
                    System.out.println("Tak for denne gang");;
                    userInput = SENTINEL;

            }



        }
    }

    public void menu() {
        System.out.println("");
        System.out.println("Hvordan vil du behandle data?");
        System.out.println("Tast 1. hvis du vil sortere efter region.");
        System.out.println("Tast 2. hvis du vil sortere efter alder.");
        System.out.println("Tast 3. hvis du vil sortere efter både region og alder.");
        System.out.println("Tast 4. hvis du vil stoppe programmet.");
    }

    public void sortRegion() {
        System.out.println("Udskrift sorteret på region: ");
        Collections.sort(instanceOfFileHandler.getListeTilConsolPrint(), new RegionComparator());
        for (Covid19Data data : instanceOfFileHandler.getListeTilConsolPrint()) {
            System.out.println(data);
        }
    }

    public void sortAlder() {
        System.out.println("Udskrift sorteret på aldersgruppe:");
        Collections.sort(instanceOfFileHandler.getListeTilConsolPrint(), new AldersGruppeComparator());
        for (Covid19Data data : instanceOfFileHandler.getListeTilConsolPrint()) {
            System.out.println(data);
        }
    }

    public void sortFlere() {
        System.out.println("Udskrift sorteret på flere parametre:");
        Collections.sort(instanceOfFileHandler.getListeTilConsolPrint(), AldersGruppeComparator.MULTIPLY_COMPARATOR);
        for (Covid19Data data : instanceOfFileHandler.getListeTilConsolPrint()) {
            System.out.println(data);
        }


    }


}







