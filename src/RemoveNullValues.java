import java.util.ArrayList;

public class RemoveNullValues {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add(null);
        students.add("Bob");
        students.add(null);
        students.add("Charlie");
        students.add("Diana");

        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i) == null) {
                students.remove(i);
            }
        }

        System.out.println("Student names after removing null values:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
