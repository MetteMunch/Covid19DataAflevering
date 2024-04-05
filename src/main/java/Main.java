import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        FileHandler instanceOfFileHandler = new FileHandler();

ArrayList<Covid19Data> listeTilConsolPrint = instanceOfFileHandler.loadCovidData();
        for (Covid19Data data: listeTilConsolPrint) {
            System.out.println(data);
        }
    }
}