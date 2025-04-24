public class Student extends uniUser {
    private String studentID;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName() + ", Student ID: " + studentID);
    }
}
