import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static final String INSERT_QUERY = "INSERT INTO students (name, age, department, year) VALUES (?, ?, ?, ?)";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM students";
    private static final String UPDATE_QUERY = "UPDATE students SET name=?, age=?, department=?, year=? WHERE id=?";
    private static final String DELETE_QUERY = "DELETE FROM students WHERE id=?";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM students WHERE id=?";
    private static final String SELECT_BY_NAME_QUERY = "SELECT * FROM students WHERE name=?";
    private static final String SELECT_BY_DEPARTMENT_QUERY = "SELECT * FROM students WHERE department=?";
    private static final String SELECT_BY_YEAR_QUERY = "SELECT * FROM students WHERE year=?";
    private static final String SELECT_BY_AGE_QUERY = "SELECT * FROM students WHERE age=?";

    public static void addStudent(Student student) {
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getDepartment());
            preparedStatement.setInt(4, student.getYear());
            preparedStatement.executeUpdate();

            System.out.println("Student added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("department"),
                        resultSet.getInt("year"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void updateStudent(Student student) {
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {

            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getDepartment());
            preparedStatement.setInt(4, student.getYear());
            preparedStatement.setInt(5, student.getId());

            preparedStatement.executeUpdate();

            System.out.println("Student updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Student getStudentById(int studentId) {
        Student student = null;
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection
                        .prepareStatement(SELECT_BY_ID_QUERY)) {

            preparedStatement.setInt(1, studentId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    student = new Student(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("department"),
                            resultSet.getInt("year"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static void deleteStudent(int studentId) {
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {

            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();

            System.out.println("Student deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getStudentsByName(String name) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME_QUERY)) {

            preparedStatement.setString(1, name);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Student student = new Student(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("department"),
                            resultSet.getInt("year"));
                    students.add(student);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static List<Student> getStudentsByDepartment(String department) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_DEPARTMENT_QUERY)) {

            preparedStatement.setString(1, department);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Student student = new Student(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("department"),
                            resultSet.getInt("year"));
                    students.add(student);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static List<Student> getStudentsByYear(int year) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_YEAR_QUERY)) {

            preparedStatement.setInt(1, year);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Student student = new Student(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("department"),
                            resultSet.getInt("year"));
                    students.add(student);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static List<Student> getStudentsByAge(int age) {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DatabaseManager.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_AGE_QUERY)) {

            preparedStatement.setInt(1, age);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Student student = new Student(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("department"),
                            resultSet.getInt("year"));
                    students.add(student);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
