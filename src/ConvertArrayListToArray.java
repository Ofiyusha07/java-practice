import java.util.ArrayList;

public class ConvertArrayListToArray {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Rome");

        String[] cityArray = cities.toArray(new String[0]);

        System.out.println("Cities array:");

        for (int i = 0; i < cityArray.length; i++) {
            System.out.println("Index " + i + ": " + cityArray[i]);
        }
    }
}
