package ph.edu.liceo.portal.model;

/**
 * MODEL: one student account.
 *
 * This class must NOT import anything from javafx.scene.
 * It only holds data about a student - no buttons, no labels.
 */
public class Student {

    // TODO 1: Six private final fields
    private final String studentNo;
    private final String password;
    private final String fullName;
    private final String course;
    private final int yearLevel;
    private final String email;

    // TODO 2: Constructor
    public Student(String studentNo, String password, String fullName,
                   String course, int yearLevel, String email) {

        this.studentNo = studentNo;
        this.password = password;
        this.fullName = fullName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.email = email;
    }

    // TODO 3: Six getters
    public String getStudentNo() {
        return studentNo;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCourse() {
        return course;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Already written for you.
     */
    public String getCourseAndYear() {
        return getCourse() + "  -  Year " + getYearLevel();
    }
}