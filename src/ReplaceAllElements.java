import java.util.ArrayList;

public class ReplaceAllElements {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }

        System.out.println("Colors after replacement:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
