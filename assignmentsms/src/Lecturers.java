import java.util.ArrayList;

public class Lecturers {
    
    private String Lname;
    private int LID;
    private int Lc;

    private ArrayList<Students> Student;
    private ArrayList<Courses> Course;
    
    public Lecturers(String Lname, int LID, int Lc) {
        this.Lname = Lname;
        this.LID = LID;
        this.Lc = Lc;
        Student = new ArrayList<>();
        Course = new ArrayList<>();
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getLID() {
        return LID;
    }

    public void setLID(int LID) {
        this.LID = LID;
    }

    public int getLc() {
        return Lc;
    }

    public void setLc(int Lc) {
        this.Lc = Lc;
    }

    public ArrayList<Students> getStudents() {
        return Student;
    }

    public void setStudent(ArrayList<Students> Student) {
        this.Student = Student;
    }

    public ArrayList<Courses> getCourse() {
        return Course;
    }

    public void setCourse(ArrayList<Courses> Course) {
        this.Course = Course;
    }
    
    @Override
    public String toString() {
        return "Lecturer"+"\nName:"+ Lname + "\nID=" + LID + "\nLC=" + Lc;
    }
}
