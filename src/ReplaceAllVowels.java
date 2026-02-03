import java.util.ArrayList;

public class  ReplaceAllVowels {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Education");
        words.add("Programming");
        words.add("Java");
        words.add("Sky");

        for (int i = 0; i < words.size(); i++) {
            String modifiedWord = words.get(i).replaceAll("(?i)[aeiou]", "*");
            words.set(i, modifiedWord);
        }

        System.out.println("Words after replacing vowels:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

