package ph.edu.liceo.portal.model;

import java.util.ArrayList;

/**
 * MODEL: the list of accounts, and the rule that decides whether a
 * student number and a password belong together.
 *
 * Like Student, this class must NOT import anything from javafx.scene.
 * A console program should be able to use it unchanged.
 */
public class StudentDirectory {

    // TODO 4: Create the students list
    private final ArrayList<Student> students = new ArrayList<>();

    public StudentDirectory() {

        // TODO 5: Add the three student accounts

        students.add(new Student(
                "2026-00123",
                "liceo123",
                "Ana Marie Dela Cruz",
                "BS Information Technology",
                3,
                "ana.delacruz@liceo.edu.ph"
        ));

        students.add(new Student(
                "2026-00456",
                "gcash456",
                "Jerome Bacaltos",
                "BS Computer Science",
                2,
                "jerome.bacaltos@liceo.edu.ph"
        ));

        students.add(new Student(
                "2026-00789",
                "maya789",
                "Liza Manalo",
                "BS Information Systems",
                4,
                "liza.manalo@liceo.edu.ph"
        ));
    }

    /**
     * THE LOGIN RULE.
     *
     * TODO 6: Loop through the list and find a matching student number
     * and password.
     */
    public Student login(String studentNo, String password) {

        for (Student student : students) {

            if (student.getStudentNo().equals(studentNo)
                    && student.getPassword().equals(password)) {

                return student;
            }
        }

        return null;
    }

    /** Already written for you. */
    public int count() {
        return students.size();
    }
}