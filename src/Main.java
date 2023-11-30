import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Students");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudents();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();

        System.out.println("Enter student department:");
        scanner.nextLine(); // Consume the newline character
        String department = scanner.nextLine();

        System.out.println("Enter student year:");
        int year = scanner.nextInt();

        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setDepartment(department);
        newStudent.setYear(year);

        StudentDAO.addStudent(newStudent);
        System.out.println("Student added successfully.");
    }

    private static void displayAllStudents() {
        List<Student> students = StudentDAO.getAllStudents();
        System.out.println("Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void updateStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the student to update:");
        int updateId = scanner.nextInt();

        Student studentToUpdate = StudentDAO.getStudentById(updateId);
        if (studentToUpdate != null) {
            System.out.println("Enter updated name:");
            scanner.nextLine(); // Consume the newline character
            studentToUpdate.setName(scanner.nextLine());

            System.out.println("Enter updated age:");
            studentToUpdate.setAge(scanner.nextInt());

            System.out.println("Enter updated department:");
            scanner.nextLine(); // Consume the newline character
            studentToUpdate.setDepartment(scanner.nextLine());

            System.out.println("Enter updated year:");
            studentToUpdate.setYear(scanner.nextInt());

            StudentDAO.updateStudent(studentToUpdate);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the student to delete:");
        int deleteId = scanner.nextInt();

        StudentDAO.deleteStudent(deleteId);
        System.out.println("Student deleted successfully.");
    }

    private static void searchStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to search for students? (yes/no)");
        String searchChoice = scanner.nextLine().toLowerCase();

        if (searchChoice.equals("yes")) {
            System.out.println("Choose a search criteria:");
            System.out.println("1. Search by ID");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by Department");
            System.out.println("4. Search by Year");
            System.out.println("5. Search by Age");

            int searchOption = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (searchOption) {
                case 1:
                    searchById();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchByDepartment();
                    break;
                case 4:
                    searchByYear();
                    break;
                case 5:
                    searchByAge();
                    break;
                default:
                    System.out.println("Invalid search option. Returning to main menu.");
            }
        }
    }

    private static void searchById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID:");
        int searchId = scanner.nextInt();

        Student student = StudentDAO.getStudentById(searchId);
        if (student != null) {
            System.out.println("Search Results:");
            System.out.println(student);
        } else {
            System.out.println("No matching students found.");
        }
    }

    private static void searchByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Name:");
        String searchName = scanner.nextLine();

        List<Student> students = StudentDAO.getStudentsByName(searchName);
        displaySearchResults(students);
    }

    private static void searchByDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Department:");
        String searchDepartment = scanner.nextLine();

        List<Student> students = StudentDAO.getStudentsByDepartment(searchDepartment);
        displaySearchResults(students);
    }

    private static void searchByYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Year:");
        int searchYear = scanner.nextInt();

        List<Student> students = StudentDAO.getStudentsByYear(searchYear);
        displaySearchResults(students);
    }

    private static void searchByAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Age:");
        int searchAge = scanner.nextInt();

        List<Student> students = StudentDAO.getStudentsByAge(searchAge);
        displaySearchResults(students);
    }

    private static void displaySearchResults(List<Student> students) {
        System.out.println("Search Results:");
        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("No matching students found.");
        }
    }
}
