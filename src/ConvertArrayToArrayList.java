import java.util.ArrayList;

public class ConvertArrayToArrayList {

    public static void main(String[] args) {

        int[] numbersArray = {1, 3, 5, 7, 9};

        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int number : numbersArray) {
            numbersList.add(number);
        }

        System.out.println("ArrayList created from array:");
        System.out.println(numbersList);
    }
}
