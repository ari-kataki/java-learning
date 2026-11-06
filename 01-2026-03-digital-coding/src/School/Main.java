import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n=== What do you want to do? ===");
            System.out.println("1 - Add students (how many kids u want)");
            System.out.println("2 - Show all students");
            System.out.println("3 - Exit");
            System.out.print("Choose 1, 2 or 3: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // clean the newline

            switch (choice) {
                case 1:
                    System.out.println("\nhow many kids u want");
                    int n = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("\ninsert matr, name, and lastname of the student");

                        System.out.print("Matricola = ");
                        String matr = scanner.next();

                        System.out.print("Name = ");
                        String name = scanner.next();

                        System.out.print("LastName = ");
                        String lastname = scanner.next();

                        studentList.add(new Student(matr, name, lastname));
                    }
                    System.out.println("Array complete here\n");
                    break;

                case 2:
                    if (studentList.isEmpty()) {
                        System.out.println("\nNo students yet! Add someone first (case 1)\n");
                    } else {
                        System.out.println("\n=== All students ===\n");
                        for (Student s : studentList) {
                            System.out.println(s.toString());
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\nBye bye! See you next time.\n");
                    break;

                default:
                    System.out.println("\nWrong number! Choose 1, 2 or 3 please.\n");
            }
        } while (choice != 3);

        scanner.close();
    }
}