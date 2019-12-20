package Lab;

public class TestCourse {
    public static void main(String[] args) {
        Course java = new Course("01", "java", 16);
        System.out.println(java.getCname());
        java.setCname("JAVA");
        System.out.println(java.getCid());
        java.setCid("100");
        System.out.println(java.getChour());
        java.setChour(160);
        java.display();
    }
}
