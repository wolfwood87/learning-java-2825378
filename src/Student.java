public class Student {

    static String college = "Yale";

    String firstName;
    String lastName;
    int expectedGraduationYear;
    double GPA;
    String declaredMajor;

    public Student(String firstName, String lastName,
                   int expectedGraduationYear, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedGraduationYear = this.expectedGraduationYear + 1;
    }
}
