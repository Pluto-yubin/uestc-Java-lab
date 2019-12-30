package Lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMyfile {
    protected static int length = 1;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Myfile people_file = new Myfile(new File("People.txt"));
        WritePerson(people_file);
        people_file.readfile(people_file.people);

        Myfile studnets_file = new Myfile(new File("Students.txt"));
        WriteStudent(studnets_file);
        studnets_file.readfile(studnets_file.students);

        Myfile teachers_file = new Myfile(new File("Teachers.txt"));
        WriteTeachers(teachers_file);
        teachers_file.readfile(teachers_file.teachers);

        Myfile courses_file = new Myfile(new File("Courses.txt"));
        WriteCourses(courses_file);
        courses_file.readfile(courses_file.courses);

        Myfile schedule_file = new Myfile(new File("Schedule.txt"));
        WriteSchedlue(schedule_file);
        schedule_file.readfile(schedule_file.schedules);

        Myfile elec_file = new Myfile(new File("elec.txt"));
        WriteElec(elec_file);
        elec_file.readfile(elec_file.electivecourses);

        System.out.println("Please enter sid");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sid = bufferedReader.readLine();
        for(int i = 0; i < 5; i++) {          // 通过学号来找选课类
            if(sid.compareTo(elec_file.electivecourses[i].getSid()) == 0 ) {
                for(int j = 0; j < 5; j++) {         //通过选课类中的classid找schedule， 输出schedule中的classroom
                    if(elec_file.electivecourses[i].getClassid().compareTo(schedule_file.schedules[j].getClassid()) == 0) {
                        System.out.println("上课教室为" + schedule_file.schedules[j].getClassrome());
                        for(int k = 0; k < 5; k++) {           //通过schedule中的cid找course
                            if(schedule_file.schedules[j].getCid().compareTo(courses_file.courses[k].getCid()) == 0) {
                                System.out.println("课程名称为" + courses_file.courses[k].getCname());    //输出课程名称
                            }
                        }
                        for(int k = 0; k < 5; k++ ) {     //通过schedule中的tid找teacher
                            if(schedule_file.schedules[j].getTid().compareTo(teachers_file.teachers[k].getTid()) == 0) {
                                System.out.println("教师名字为" + teachers_file.teachers[k].getName());
                            }
                        }
                    }
                }
            }
        }
        System.out.println("If not information output, it means sid not found");
    }

    private static void WritePerson(Myfile myfile) throws IOException {

        String s = new String();
        String name = new String();
        String sex = new String();
        int age;
        for(int j = 0; j < myfile.people.length; j++)
            myfile.people[j] = new Person(null, null, 0);
        System.out.println("请输入第"+ length+ "个Person信息， 按F键退出");
        length++;
        int i = 0;
        while (s.compareTo("Y") != 0 && s.compareTo("y") != 0){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入姓名");
            name = bufferedReader.readLine();
            myfile.people[i].setName(name);

            System.out.println("请输入性别");
            sex = bufferedReader.readLine();
            myfile.people[i].setSex(sex);

            System.out.println("请输入年龄");
            age = Integer.parseInt(bufferedReader.readLine());
            myfile.people[i].setAge(age);

            System.out.println("Do you want to exit?  Y/N");
            s = bufferedReader.readLine();

            myfile.Writefile(myfile.people[i]);
            i++;
        }
    }
    private static void WriteStudent(Myfile myfile) throws IOException {
        String s = new String();
        String name = new String();
        String sex = new String();
        String sid = new String();
        String major = new String();
        int age;
        for(int j = 0; j < myfile.students.length; j++)
            myfile.students[j] = new Student(null, null, 0, null, null);
        length = 1;
        System.out.println("请输入第"+ length+ "个Student信息， 按F键退出");
        length++;
        int i = 0;
        while (s.compareTo("Y") != 0 && s.compareTo("y") != 0){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入姓名");
            name = bufferedReader.readLine();
            myfile.students[i].setName(name);

            System.out.println("请输入性别");
            sex = bufferedReader.readLine();
            myfile.students[i].setSex(sex);

            System.out.println("请输入年龄");
            age = Integer.parseInt(bufferedReader.readLine());
            myfile.students[i].setAge(age);

            System.out.println("请输入学号");
            sid = bufferedReader.readLine();
            myfile.students[i].setSid(sid);

            System.out.println("请输入专业");
            major = bufferedReader.readLine();
            myfile.students[i].setMajor(major);

            System.out.println("Do you want to exit?  Y/N");
            s = bufferedReader.readLine();

            myfile.Writefile(myfile.students[i]);
            i++;
        }
    }
    private static void WriteTeachers(Myfile myfile) throws IOException {
        String s = new String();
        String name = new String();
        String sex = new String();
        String tid = new String();
        String title = new String();
        int age;
        for(int j = 0; j < myfile.teachers.length; j++)
            myfile.teachers[j] = new Teacher(null, null, 0, null, null);
        length = 1;
        System.out.println("请输入第"+ length+ "个Teacher信息");
        length++;
        int i = 0;
        while (s.compareTo("Y") != 0 && s.compareTo("y") != 0){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入姓名");
            name = bufferedReader.readLine();
            myfile.teachers[i].setName(name);

            System.out.println("请输入性别");
            sex = bufferedReader.readLine();
            myfile.teachers[i].setSex(sex);

            System.out.println("请输入年龄");
            age = Integer.parseInt(bufferedReader.readLine());
            myfile.teachers[i].setAge(age);

            System.out.println("请输入教师编号");
            tid = bufferedReader.readLine();
            myfile.teachers[i].setTid(tid);

            System.out.println("请输入所教课程");
            title = bufferedReader.readLine();
            myfile.teachers[i].setTitle(title);

            System.out.println("Do you want to exit?  Y/N");
            s = bufferedReader.readLine();

            myfile.Writefile(myfile.teachers[i]);
            i++;
        }
    }
    private static void WriteCourses(Myfile myfile) throws IOException {
        String s = new String();
        String cname = new String();
        String cid = new String();
        int chour;
        for(int j = 0; j < myfile.teachers.length; j++)
            myfile.courses[j] = new Course(null, null, 0);
        length = 1;
        System.out.println("请输入第"+ length+ "个Course信息， 按F键退出");
        length++;
        int i = 0;
        while (s.compareTo("Y") != 0 && s.compareTo("y") != 0){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入课程名字");
            cname = bufferedReader.readLine();
            myfile.courses[i].setCname(cname);

            System.out.println("请输入课程id");
            cid = bufferedReader.readLine();
            myfile.courses[i].setCid(cid);

            System.out.println("请输入课时");
            chour = Integer.parseInt(bufferedReader.readLine());
            myfile.courses[i].setChour(chour);

            System.out.println("Do you want to exit?  Y/N");
            s = bufferedReader.readLine();

            myfile.Writefile(myfile.courses[i]);
            i++;
        }
    }
    private static void WriteSchedlue(Myfile myfile) throws IOException {
        String s = new String();
        String classid = new String();
        String cid = new String();
        String tid = new String();
        String classroom = new String();
        for(int j = 0; j < myfile.schedules.length; j++)
            myfile.schedules[j] = new Schedule(null, null, null,null);
        length = 1;
        System.out.println("请输入第"+ length+ "个Schedule信息， 按F键退出");
        length++;
        int i = 0;
        while (s.compareTo("Y") != 0 && s.compareTo("y") != 0){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入教室ID");
            classid = bufferedReader.readLine();
            myfile.schedules[i].setClassid(classid);

            System.out.println("请输入课程id");
            cid = bufferedReader.readLine();
            myfile.schedules[i].setCid(cid);

            System.out.println("请输入教师ID");
            tid = bufferedReader.readLine();
            myfile.schedules[i].setTid(tid);

            System.out.println("请输入教室名称");
            classroom = bufferedReader.readLine();
            myfile.schedules[i].setClassrome(classroom);

            System.out.println("Do you want to exit?  Y/N");
            s = bufferedReader.readLine();

            myfile.Writefile(myfile.schedules[i]);
            i++;
        }
    }
    private static void WriteElec(Myfile myfile) throws IOException {
        String s = new String();
        String elid = new String();
        String sid = new String();
        String classid = new String();
        for(int j = 0; j < myfile.electivecourses.length; j++)
            myfile.electivecourses[j] = new Electivecourse(null, null, null);
        length = 1;
        System.out.println("请输入第"+ length+ "个Electivecourse信息");
        length++;
        int i = 0;
        while (s.compareTo("Y") != 0 && s.compareTo("y") != 0){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入选修课ID");
            elid = bufferedReader.readLine();
            myfile.electivecourses[i].setElid(elid);

            System.out.println("请输入学生id");
            sid = bufferedReader.readLine();
            myfile.electivecourses[i].setSid(sid);

            System.out.println("请输入课程ID");
            classid = bufferedReader.readLine();
            myfile.electivecourses[i].setClassid(classid);

            System.out.println("Do you want to exit?  Y/N");
            s = bufferedReader.readLine();

            myfile.Writefile(myfile.electivecourses[i]);
            i++;
        }
    }

}