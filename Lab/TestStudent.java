package Lab;

public class TestStudent {
    public static void main(String[] args) {
        Student hht = new Student("黄浩庭", "male",
                18, "123", "Engineer");
        System.out.println(hht.getName());
        hht.setName("我是黄浩庭");
        System.out.println(hht.getAge());
        hht.setAge(108);
        System.out.println(hht.getSex());
        hht.setSex("female");
        System.out.println(hht.getMajor());
        hht.setMajor("Software");
        System.out.println(hht.getSid());
        hht.setSid("321");
        hht.display();
    }
}
