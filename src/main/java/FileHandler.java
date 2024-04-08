import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File covidFile = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");
    private ArrayList<Covid19Data> listeTilConsolPrint = loadCovidData();

    public ArrayList<Covid19Data> loadCovidData (){
        ArrayList<Covid19Data> covidData = new ArrayList();
        Scanner scannerInput = null;
        try {
            scannerInput = new Scanner(covidFile);
        } catch (FileNotFoundException e) {
            System.out.println("Noget gik galt, og der kom en exception!");
            throw new RuntimeException(e);

        }

        Covid19Data posterFraListen = null;
        while(scannerInput.hasNext()) {
            String line = scannerInput.nextLine();//HVORFOR DENNE...DET FORSTÅR JEG IKKE?
            String[] attributter = line.split(";");
            posterFraListen = new Covid19Data(
                    (attributter[0]),//String region
                    (attributter[1]),//String aldersgruppe
                    (Integer.parseInt(attributter[2])),//int bekræftede tilfælde
                    (Integer.parseInt(attributter[3])),//int døde
                    (Integer.parseInt(attributter[4])),//int indlagte intensiv
                    (Integer.parseInt(attributter[5])),//int indlagte samlet
                    (attributter[6])//String dato
            );
            covidData.add(posterFraListen);
        }
        scannerInput.close();
        return covidData;

    }

    public ArrayList<Covid19Data> getListeTilConsolPrint() {
        return listeTilConsolPrint;
    }
}
