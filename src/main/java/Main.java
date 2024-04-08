import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        FileHandler instanceOfFileHandler = new FileHandler();

        ArrayList<Covid19Data> listeTilConsolPrint = instanceOfFileHandler.loadCovidData();

        System.out.println("Udskrift sorteret på region: ");
        Collections.sort(listeTilConsolPrint,new RegionComparator());
        for (Covid19Data data : listeTilConsolPrint) {
            System.out.println(data);
        }
        System.out.println("");//linje for at gøre det mere letlæseligt

        System.out.println("Udskrift sorteret på aldersgruppe:");
        Collections.sort(listeTilConsolPrint,new AldersGruppeComparator());
        for (Covid19Data data : listeTilConsolPrint) {
            System.out.println(data);
        }

        System.out.println("");//linje for at gøre det mere letlæseligt

        System.out.println("Udskrift sorteret på flere parametre:");
        Collections.sort(listeTilConsolPrint, AldersGruppeComparator.MULTIPLY_COMPARATOR);
        for (Covid19Data data : listeTilConsolPrint) {
            System.out.println(data);
        }
    }

}