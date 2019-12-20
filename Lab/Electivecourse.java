package Lab;

import java.io.Serializable;

class Electivecourse implements Serializable {
    private String elid;
    private String sid;
    private String classid;
    Electivecourse(String elid, String sid, String classid){
        this.elid = elid;
        this.sid = sid;
        this.classid = classid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getElid() {
        return elid;
    }

    public void setElid(String elid) {
        this.elid = elid;
    }
    public void display(){
        System.out.println("elid: "+getElid());
        System.out.println("sid: "+getSid());
        System.out.println("classid: "+getClassid());
    }
}
