package InterfaceAbstractLab1;

/**
 *
 * @author kowal_000
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);

    public final double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);

    public final String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);
    
    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

}
