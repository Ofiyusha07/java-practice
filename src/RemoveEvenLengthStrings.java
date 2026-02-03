import java.util.ArrayList;

public class RemoveEvenLengthStrings {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Artem");      // 4 → чётная
        names.add("Boston");       // 3
        names.add("Michael");  // 7
        names.add("Suluu");      // 4 → чётная
        names.add("Tom");       // 3

        for (int i = names.size() - 1; i >= 0; i--) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
            }
        }

        System.out.println("Names with odd length:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

