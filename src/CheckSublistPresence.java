import java.util.ArrayList;
import java.util.Arrays;

public class CheckSublistPresence {

    public static void main(String[] args) {

        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Hockey");

        ArrayList<String> subSports = new ArrayList<>(
                Arrays.asList("Football", "Tennis")
        );

        if (sports.containsAll(subSports)) {
            System.out.println("The list contains all elements of the sublist.");
        } else {
            System.out.println("The list does NOT contain all elements of the sublist.");
        }
    }
}
