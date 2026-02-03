import java.util.ArrayList;

public class  CreateNestedArrayList {

    public static void main(String[] args) {

        ArrayList<String> hrDepartment = new ArrayList<>();
        hrDepartment.add("Alice");
        hrDepartment.add("Bob");

        ArrayList<String> itDepartment = new ArrayList<>();
        itDepartment.add("Charlie");
        itDepartment.add("Diana");
        itDepartment.add("Ethan");

        ArrayList<String> financeDepartment = new ArrayList<>();
        financeDepartment.add("Fiona");
        financeDepartment.add("George");

        ArrayList<ArrayList<String>> company = new ArrayList<>();

        company.add(hrDepartment);
        company.add(itDepartment);
        company.add(financeDepartment);

        System.out.println("Company departments and employees:");

        int departmentNumber = 1;
        for (ArrayList<String> department : company) {
            System.out.println("Department " + departmentNumber + ":");
            for (String employee : department) {
                System.out.println(" - " + employee);
            }
            departmentNumber++;
        }
    }
}
