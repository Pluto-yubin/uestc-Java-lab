package Lab;

public class TestElec {
    public static void main(String[] args) {
        Electivecourse e = new Electivecourse("001", "002",
                "003");
        System.out.println(e.getElid());
        e.setElid("100");
        System.out.println(e.getSid());
        e.setSid("200");
        System.out.println(e.getClassid());
        e.setClassid("300");
        e.display();
    }
}
