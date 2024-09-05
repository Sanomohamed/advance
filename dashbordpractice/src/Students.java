public class Students {
    public final static int sta_auth=0,stat_no_auth=1; 
    private String name;
    private String id;
    private String password;
    private String email;
    private int status;

    public Students(String name, String id, String password, String email) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.status = stat_no_auth;
    }
    
    public boolean authenticate(Students student){
        boolean auth=false;
        
        if(id.equals(student.getId())&& password.equals(student.getPassword())){
            auth=true;
            student.setStatus(sta_auth);
        }
        return auth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    } 
}
