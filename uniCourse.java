public abstract class uniCourse implements course {
    private String courseName;

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public abstract void displayCourseInfo();
}
