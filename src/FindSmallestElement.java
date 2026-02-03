import java.util.ArrayList;

public class FindSmallestElement {

    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Bohemian Rhapsody");
        songs.add("Hello");
        songs.add("Sky");
        songs.add("Yesterday");
        songs.add("One");

        if (songs.isEmpty()) {
            System.out.println("Song list is empty");
            return;
        }

        String shortestSong = songs.get(0);

        for (String song : songs) {
            if (song.length() < shortestSong.length()) {
                shortestSong = song;
            }
        }

        System.out.println("Shortest song title: " + shortestSong);
    }
}

