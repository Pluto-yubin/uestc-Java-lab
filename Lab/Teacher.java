package Lab;

class Teacher extends Person {
    private String tid;
    private String title;

    Teacher(String name, String sex, int age, String tid, String title) {
        super(name, sex, age);
        this.tid = tid;
        this.title = title;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void display(){
        super.display();
        System.out.println("tid: " + getTid());
        System.out.println("title: " + getTitle());
    }
}



