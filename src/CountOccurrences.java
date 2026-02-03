import java.util.ArrayList;

public class CountOccurrences {

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Water");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Juice");

        int count = 0;

        for (String drink : drinks) {
            if (drink.equals("Coffee")) {
                count++;
            }
        }

        System.out.println("Coffee appears " + count + " times");
    }
}
