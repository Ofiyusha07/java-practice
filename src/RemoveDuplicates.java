import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Dog");
        animals.add("Elephant");

        ArrayList<String> uniqueAnimals = new ArrayList<>();

        for (String animal : animals) {
            if (!uniqueAnimals.contains(animal)) {
                uniqueAnimals.add(animal);
            }
        }

        System.out.println("Animals without duplicates:");
        for (String animal : uniqueAnimals) {
            System.out.println(animal);
        }
    }
}

