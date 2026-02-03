import java.util.ArrayList;

public class  PartitionArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        System.out.println("Even numbers:");
        System.out.println(evenNumbers);

        System.out.println("Odd numbers:");
        System.out.println(oddNumbers);
    }
}
