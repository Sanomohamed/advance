public class Students {    

    private String sname;
    private int sid;
    private int sc;

    public Students(String sname, int sid, int sc) {
        this.sname = sname;
        this.sid = sid;
        this.sc = sc;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSc() {
        return sc;
    }

    public void setSc(int sc) {
        this.sc = sc;
    }

    @Override
    public String toString() {
        return "Student"+"\nName:" + sname + "\nID:" + sid + "\nSC=" + sc ;
    }
}
