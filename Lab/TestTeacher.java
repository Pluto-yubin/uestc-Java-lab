package Lab;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher cz = new Teacher("Zhenchen", "male",
                30, "100", "Tutor");
        System.out.println(cz.getName());
        cz.setName("Chenzhen");
        System.out.println(cz.getAge());
        cz.setAge(31);
        System.out.println(cz.getSex());
        cz.setSex("MALE");
        System.out.println(cz.getTitle());
        cz.setTitle("Professor");
        System.out.println(cz.getTid());
        cz.setTid("001");
        cz.display();
    }

}
