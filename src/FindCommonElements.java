import java.util.ArrayList;

public class FindCommonElements {

    public static void main(String[] args) {

        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("France");
        countries1.add("Germany");
        countries1.add("Italy");
        countries1.add("Spain");

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Italy");
        countries2.add("Spain");
        countries2.add("Portugal");
        countries2.add("France");

        ArrayList<String> commonCountries = new ArrayList<>();

        for (String country : countries1) {
            if (countries2.contains(country) && !commonCountries.contains(country)) {
                commonCountries.add(country);
            }
        }

        System.out.println("Common countries:");
        for (String country : commonCountries) {
            System.out.println(country);
        }
    }
}

