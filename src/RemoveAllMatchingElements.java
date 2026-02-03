import java.util.ArrayList;

public class RemoveAllMatchingElements {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Banana");

        fruits.removeIf(fruit -> fruit.equals("Banana"));

        System.out.println("Fruits after removing Banana:");

        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
