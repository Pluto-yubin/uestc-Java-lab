package Lab;

public class TestPerson {
    public static void main(String[] args) {
        Person hht = new Person("黄浩庭", "male", 18);
        System.out.println(hht.getName());
        hht.setName("我是黄浩庭");
        System.out.println(hht.getAge());
        hht.setAge(108);
        System.out.println(hht.getSex());
        hht.setSex("female");
        hht.display();
    }
}
