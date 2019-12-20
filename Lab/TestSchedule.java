package Lab;

public class TestSchedule {
    public static void main(String[] args) {
        Schedule schedule = new Schedule("123", "001",
                "100", "210");
        System.out.println(schedule.getClassid());
        schedule.setClassid("321");
        System.out.println(schedule.getCid());
        schedule.setCid("100");
        System.out.println(schedule.getTid());
        schedule.setTid("001");
        System.out.println(schedule.getClassrome());
        schedule.setClassrome("212");
        schedule.display();
    }
}
