import java.util.ArrayList;

public class FindIndexOfElement {

    public static void main(String[] args) {

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Lily");
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Rose");

        int firstIndex = flowers.indexOf("Rose");
        int lastIndex = flowers.lastIndexOf("Rose");

        System.out.println("First index of Rose: " + firstIndex);
        System.out.println("Last index of Rose: " + lastIndex);
    }
}
