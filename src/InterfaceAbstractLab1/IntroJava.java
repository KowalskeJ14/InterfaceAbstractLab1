package InterfaceAbstractLab1;

import javax.swing.JOptionPane;

/**
 *
 * @author kowal_000
 */
public class IntroJava extends Course{
    private double credits;
    private String prerequisites;
    
    public IntroJava(String courseName, String courseNumber){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public void testCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
}
