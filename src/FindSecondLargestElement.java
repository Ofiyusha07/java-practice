import java.util.ArrayList;

public class FindSecondLargestElement {

    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("The Lord of the Rings");
        movies.add("Avatar");
        movies.add("Interstellar");
        movies.add("Up");

        if (movies.size() < 2) {
            System.out.println("Not enough elements in the list");
            return;
        }

        String longest = "";
        String secondLongest = "";

        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                secondLongest = longest;
                longest = movie;
            } else if (movie.length() > secondLongest.length()
                    && movie.length() < longest.length()) {
                secondLongest = movie;
            }
        }

        System.out.println("Second longest movie title: " + secondLongest);
    }
}
