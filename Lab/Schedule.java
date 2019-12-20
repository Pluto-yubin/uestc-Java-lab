package Lab;

import java.io.Serializable;

class Schedule implements Serializable {
    private String classid;
    private String cid;
    private String tid;
    private String classrome;
    Schedule(String classid, String cid, String tid, String classroom){
        this.cid = cid;
        this.classid = classid;
        this.classrome = classroom;
        this.tid = tid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassrome() {
        return classrome;
    }

    public void setClassrome(String classrome) {
        this.classrome = classrome;
    }

    public void display(){
        System.out.println("classid: "+getClassid());
        System.out.println("cid: "+getCid());
        System.out.println("tid: "+getTid());
        System.out.println("classroom: "+getClassrome());
    }
}
