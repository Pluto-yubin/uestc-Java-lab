package Lab;

import java.io.Serializable;

class Course implements Serializable {
    private String cname;
    private String cid;
    private int chour;
    Course(String cid, String cname, int chour){
        this.cname = cname;
        this.cid = cid;
        this.chour = chour;
    }

    public int getChour() {
        return chour;
    }

    public void setChour(int chour) {
        this.chour = chour;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
    public void display(){
        System.out.println("cname: " + getCname());
        System.out.println("cid: "+getCid());
        System.out.println("chour: "+getChour());
    }
}


