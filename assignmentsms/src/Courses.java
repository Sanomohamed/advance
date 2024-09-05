public class Courses {
    
    private String cname;
    private int cid;
    private int cc;

    public Courses(String cname, int cid, int cc) {
        this.cname = cname;
        this.cid = cid;
        this.cc = cc;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Course" + "\nName:" + cname + "\nID:" + cid + "\nCC:" + cc ;
    }
}
