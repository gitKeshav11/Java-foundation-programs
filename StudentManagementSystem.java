import java.util.*;

// Student Class with Encapsulation
class Student {
    private int id;
    private String name;
    private String course;
    private double marks;

    public Student(int id, String name, String course, double marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Course: " + course + " | Marks: " + marks;
    }
}

public class StudentManagementSystem {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Update Student Marks");
                System.out.println("5. Remove Student by ID");
                System.out.println("6. Sort Students by Marks");
                System.out.println("7. Exit");
                System.out.print("Choose an option: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1: addStudent(); break;
                    case 2: displayStudents(); break;
                    case 3: searchStudent(); break;
                    case 4: updateMarks(); break;
                    case 5: removeStudent(); break;
                    case 6: sortStudents(); break;
                    case 7:
                        System.out.println("Exiting System...");
                        System.exit(0);
                    default: System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter numbers where required.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID (int): ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Marks (double): ");
        double marks = Double.parseDouble(scanner.nextLine());

        students.add(new Student(id, name, course, marks));
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
        } else {
            System.out.println("\n--- All Students ---");
            students.forEach(System.out::println);
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID to Search: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Found: " + s);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student with ID " + id + " not found.");
    }

    private static void updateMarks() {
        System.out.print("Enter ID to Update Marks: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter New Marks: ");
                s.setMarks(Double.parseDouble(scanner.nextLine()));
                System.out.println("Marks updated successfully!");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    private static void removeStudent() {
        System.out.print("Enter ID to Remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) System.out.println("Student removed successfully!");
        else System.out.println("ID not found.");
    }

    private static void sortStudents() {
        students.sort((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));
        System.out.println("Students sorted by marks (Descending):");
        displayStudents();
    }
}