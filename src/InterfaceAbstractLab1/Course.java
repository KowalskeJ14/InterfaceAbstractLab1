package InterfaceAbstractLab1;

/**
 *
 * @author kowal_000
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public final String getCapitalizedCourseName(){
        return this.getCourseName().toUpperCase();
    }
    
    public abstract void testCredits();
}
