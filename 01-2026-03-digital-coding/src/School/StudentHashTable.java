import java.util.HashMap;

public class StudentHashTable {

    private HashMap<String, Student> table;

    public StudentHashTable() {
        this.table = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (student == null || student.getId() == null) {
            System.out.println("Error: student or matr cannot be null.");
            return;
        }
        if (table.containsKey(student.getId())) {
            System.out.println("Warning: matr " + student.getId() + " already exists.");
            return;
        }
        table.put(student.getId(), student);
        System.out.println("School.Student " + student.getName() + " " + student.getSurname() + " added successfully.");
    }

    public boolean removeByMatr(String matr) {
        if (matr == null) {
            System.out.println("Error: matr cannot be null.");
            return false;
        }
        if (!table.containsKey(matr)) {
            System.out.println("Error: no student found with matr " + matr + ".");
            return false;
        }
        Student removed = table.remove(matr);
        System.out.println("School.Student " + removed.getName() + " " + removed.getSurname() + " removed successfully.");
        return true;
    }

    public Student getByMatr(String matr) {
        if (matr == null) return null;
        return table.getOrDefault(matr, null);
    }

    public void printAll() {
        if (table.isEmpty()) {
            System.out.println("The table is empty.");
            return;
        }
        for (Student s : table.values()) {
            System.out.println(s);
        }
    }

    public int size() {
        return table.size();
    }
}