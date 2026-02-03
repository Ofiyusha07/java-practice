import java.util.ArrayList;

public class ReplaceElementsWithLengths {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }

        System.out.println("Lengths of fruit names:");
        for (int length : lengths) {
            System.out.println(length);
        }
    }
}
