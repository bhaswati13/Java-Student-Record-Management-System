import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create a new student");
            System.out.println("2. Read all students");
            System.out.println("3. Update a student");
            System.out.println("4. Delete a student");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void createStudent(Scanner scanner) {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();

        System.out.println("Enter student grade:");
        double grade = scanner.nextDouble();

        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setGrade(grade);

        StudentDAO.addStudent(newStudent);
        System.out.println("Student added successfully.");
    }

    private static void updateStudent(Scanner scanner) {
        System.out.println("Enter the ID of the student to update:");
        int updateId = scanner.nextInt();

        Student studentToUpdate = StudentDAO.getStudentById(updateId);
        if (studentToUpdate != null) {
            System.out.println("Enter updated name:");
            scanner.nextLine(); // Consume the newline character
            studentToUpdate.setName(scanner.nextLine());

            System.out.println("Enter updated age:");
            studentToUpdate.setAge(scanner.nextInt());

            System.out.println("Enter updated grade:");
            studentToUpdate.setGrade(scanner.nextDouble());

            StudentDAO.updateStudent(studentToUpdate);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.println("Enter the ID of the student to delete:");
        int deleteId = scanner.nextInt();

        StudentDAO.deleteStudent(deleteId);
        System.out.println("Student deleted successfully.");
    }

    private static void displayAllStudents() {
        List<Student> students = StudentDAO.getAllStudents();
        System.out.println("Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
