package Lab;

class Student extends Person{
    private String sid;
    private String major;
    Student(String name, String sex, int age, String sid, String major) {
        super(name, sex, age);
        this.sid = sid;
        this.major = major;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void display(){
        super.display();
        System.out.println("sid: " + getSid());
        System.out.println("major: "+getMajor());
    }
}

