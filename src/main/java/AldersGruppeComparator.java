import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {

    public static Comparator<Covid19Data> MULTIPLY_COMPARATOR = Comparator.comparing(Covid19Data::getRegion)
            .thenComparing(Covid19Data::getAldersgruppe)
            .thenComparing(Covid19Data::getDøde);

    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        return o1.getAldersgruppe().compareTo(o2.getAldersgruppe());
    }
}
