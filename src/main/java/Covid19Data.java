public class Covid19Data {

    //attributter
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagteIntensiv;
    private int indlagteSamlet;
    private String dato;

    //constructor
    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagteIntensiv, int indlagteSamlet, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagteSamlet = indlagteSamlet;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Region: " + region +
                ", Aldersgruppe: " + aldersgruppe +
                ", Bekræftede tilfælde: " + bekræftedeTilfælde +
                ", Døde: " + døde +
                ", Indlagte på intensiv: " + indlagteIntensiv +
                ", Indlagte samlet: " + indlagteSamlet +
                ", Dato: " + dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getDøde() {
        return døde;
    }
}
