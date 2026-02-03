import java.util.ArrayList;

public class RotateElements {

    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        int rotateBy = 2;
        int size = days.size();

        ArrayList<String> rotatedDays = new ArrayList<>();

        // добавляем последние 2 элемента
        for (int i = size - rotateBy; i < size; i++) {
            rotatedDays.add(days.get(i));
        }

        // добавляем остальные
        for (int i = 0; i < size - rotateBy; i++) {
            rotatedDays.add(days.get(i));
        }

        System.out.println("Days after rotation:");
        for (String day : rotatedDays) {
            System.out.println(day);
        }
    }
}
