/**
 * This class represents a Student with basic attributes and methods.
 * @author Tony Tran
 * @version 1.0
 * @since 2025-05-18
 */
public class Student {
    /** The first name of the student. */
    private String firstName;
    /** The middle initial of the student. */
    private String midInit;
    /** The last name of the student. */
    private String lastName;
    /** The grade of the student. */
    private int grade;
    /** Indicates if the student has an IEP. */
    private boolean iep;
    /**
     * Constructor for the Student class.
     *
     * @param fName The first name of the student.
     * @param lName The last name of the student.
     * @param grades The grade of the student.
     * @param iepU  Indicates if the student has an IEP.
     */
    public Student(final String fName,
            final String lName, final int grades, final boolean iepU) {
        this.firstName = fName;
        this.lastName = lName;
        this.grade = grades;
        this.iep = iepU;
    }
    /**
     * Constructor for the Student class with middle initial.
     *
     * @param fName The first name of the student.
     * @param midIn The middle initial of the student.
     * @param lName The last name of the student.
     * @param grades The grade of the student.
     * @param iepU  Indicates if the student has an IEP.
     */
    public Student(final String fName, final String midIn,
            final String lName, final int grades, final boolean iepU) {
        this.firstName = fName;
        this.midInit = midIn;
        this.lastName = lName;
        this.grade = grades;
        this.iep = iepU;
    }

}
