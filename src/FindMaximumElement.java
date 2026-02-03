import java.util.ArrayList;

public class FindMaximumElement {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Tokyo");
        cities.add("Buenos Aires");

        String longestCity = "";

        for (String city : cities) {
            if (city.length() > longestCity.length()) {
                longestCity = city;
            }
        }

        System.out.println("Longest city name: " + longestCity);
    }
}
