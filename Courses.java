
public class Courses extends uniCourse {
    private int courseID;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Course Name: " + getCourseName() + ", Course ID: " + courseID);
    }
}
