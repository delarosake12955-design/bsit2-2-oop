import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Enrolled {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        HashMap<String, ArrayList<String>> enrollments = new HashMap<>();

        String[] validPrograms = {"BSIT", "BSCS"};

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("      LICEO ENROLLMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("[1] Register Student");
            System.out.println("[2] Add Course Offering");
            System.out.println("[3] Enroll Student to Course");
            System.out.println("[4] View All Students");
            System.out.println("[5] View All Courses");
            System.out.println("[6] View Student Load");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.println("\n--- REGISTER STUDENT ---");

                    System.out.print("Student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Full Name: ");
                    String name = sc.nextLine();

                    System.out.print("Program: ");
                    String program = sc.nextLine().toUpperCase();

                    boolean valid = false;

                    for (int i = 0; i < validPrograms.length; i++) {

                        if (program.equals(validPrograms[i])) {
                            valid = true;
                        }

                    }

                    if (!valid) {

                        System.out.println("Invalid Program.");
                        break;

                    }

                    System.out.print("Year Level: ");
                    int year = Integer.parseInt(sc.nextLine());

                    if (year < 1 || year > 4) {

                        System.out.println("Invalid Year Level.");
                        break;

                    }

                    Student student = new Student(id, name, program, year);

                    students.add(student);

                    System.out.println("Student Registered Successfully.");

                    break;

                case 2:

                    System.out.println("\n--- ADD COURSE ---");

                    System.out.print("Course Code: ");
                    String code = sc.nextLine();

                    System.out.print("Course Title: ");
                    String title = sc.nextLine();

                    System.out.print("Units: ");
                    int units = Integer.parseInt(sc.nextLine());

                    System.out.print("Capacity: ");
                    int capacity = Integer.parseInt(sc.nextLine());

                    Course course = new Course(code, title, units, capacity);

                    courses.add(course);

                    System.out.println("Course Added.");

                    break;

                case 3:

                    System.out.println("\n--- ENROLL STUDENT ---");

                    System.out.print("Student ID: ");
                    String sid = sc.nextLine();

                    Student foundStudent = null;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).getStudentId().equals(sid)) {

                            foundStudent = students.get(i);

                        }

                    }

                    if (foundStudent == null) {

                        System.out.println("Student Not Found.");
                        break;

                    }

                    System.out.print("Course Code: ");
                    String ccode = sc.nextLine();

                    Course foundCourse = null;

                    for (int i = 0; i < courses.size(); i++) {

                        if (courses.get(i).getCourseCode().equals(ccode)) {

                            foundCourse = courses.get(i);

                        }

                    }

                    if (foundCourse == null) {

                        System.out.println("Course Not Found.");
                        break;

                    }

                    if (foundCourse.isFull()) {

                        System.out.println("Course is Full.");
                        break;

                    }

                    if (!enrollments.containsKey(sid)) {

                        enrollments.put(sid, new ArrayList<>());

                    }

                    if (enrollments.get(sid).contains(ccode)) {

                        System.out.println("Student Already Enrolled.");
                        break;

                    }

                    enrollments.get(sid).add(ccode);

                    foundCourse.addOneEnrollee();

                    System.out.println("Enrollment Successful.");

                    break;

                case 4:

                    System.out.println("\n--- ALL STUDENTS ---");

                    if (students.size() == 0) {

                        System.out.println("No Students Yet.");

                    } else {

                        for (int i = 0; i < students.size(); i++) {

                            System.out.println(students.get(i).describe());

                        }

                    }

                    break;

                case 5:

                    System.out.println("\n--- ALL COURSES ---");

                    if (courses.size() == 0) {

                        System.out.println("No Courses Yet.");

                    } else {

                        for (int i = 0; i < courses.size(); i++) {

                            Course c = courses.get(i);

                            System.out.println(
                                    c.getCourseCode() + " | "
                                            + c.getTitle() + " | "
                                            + c.getUnits() + " Units | "
                                            + c.getEnrolledCount() + "/"
                                            + c.getCapacity());

                        }

                    }

                    break;

                case 6:

                    System.out.println("\n--- STUDENT LOAD ---");

                    System.out.print("Student ID: ");
                    String studentId = sc.nextLine();

                    if (!enrollments.containsKey(studentId)) {

                        System.out.println("No Enrollments.");

                    } else {

                        int total = 0;

                        ArrayList<String> list = enrollments.get(studentId);

                        for (int i = 0; i < list.size(); i++) {

                            for (int j = 0; j < courses.size(); j++) {

                                if (courses.get(j).getCourseCode().equals(list.get(i))) {

                                    System.out.println(
                                            courses.get(j).getCourseCode()
                                                    + " "
                                                    + courses.get(j).getTitle()
                                                    + " "
                                                    + courses.get(j).getUnits()
                                                    + " Units");

                                    total += courses.get(j).getUnits();

                                }

                            }

                        }

                        System.out.println("------------------------");
                        System.out.println("Total Units: " + total);

                    }

                    break;

                case 0:

                    System.out.println("Thank you for using the Liceo Enrollment System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 0);

        sc.close();

    }

}