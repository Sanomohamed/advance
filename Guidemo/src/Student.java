public class Student {
    
    private String Student_ID;
    private String Student_name;

    public Student(String Student_ID, String Student_name) {
        this.Student_ID = Student_ID;
        this.Student_name = Student_name;
    }

    public String getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(String Student_ID) {
        this.Student_ID = Student_ID;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String Student_name) {
        this.Student_name = Student_name;
    }

    @Override
    public String toString() {
        return "Student" + "\nID:" + Student_ID + "\nName:" + Student_name + '}';
    }
    
    
    
}
