import java.util.ArrayList;

public class program {
   private String proname;
   private int produration;
   private int procredithours;
   
   private ArrayList<Student> Student;

    public program(String proname, int produration, int procredithours) {
        this.proname = proname;
        this.produration = produration;
        this.procredithours = procredithours;
        Student = new ArrayList<>();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public int getProduration() {
        return produration;
    }

    public void setProduration(int produration) {
        this.produration = produration;
    }

    public int getProcredithours() {
        return procredithours;
    }

    public void setProcredithours(int procredithours) {
        this.procredithours = procredithours;
    }

    public ArrayList<Student> getStudent() {
        return Student;
    }

    public void setStudent(ArrayList<Student> Student) {
        this.Student = Student;
    }

    @Override
    public String toString() {
        return "Program" + "\nName:" + proname +
                "\nDuration=" + produration + "\nCredit hours:" + procredithours ;
    }  
}
