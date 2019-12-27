package Lab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MyObjectOutputStream extends ObjectOutputStream {

    int i = 1;
    protected void writeStreamHeader() throws IOException {
        return;
    }

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

}
class Myfile implements Serializable{
    File opfile = new File(".");
    protected Person[] people = new Person[10];
    Student[] students = new Student[10];
    Teacher[] teachers = new  Teacher[10];
    Course[] courses = new Course[10];
    Schedule[] schedules = new Schedule[10];
    Electivecourse[] electivecourses = new Electivecourse[10];
    Myfile(File file) throws IOException {
        this.opfile = file;
        if(!file.exists()) {
            String s;
            Scanner scanner = new Scanner(System.in);
            System.out.println("DO YOU WANT TO STORY IT? Y'\'N");
            s = scanner.nextLine();
            if (s.equals("N"))
                opfile.createNewFile();
            if (opfile.exists())
                System.out.println("Create successfully");
        }
    }
  //  Myfile myfile = new Myfile(new File("test.txt"));

    void readfile(Person[] people) throws IOException, ClassNotFoundException {
        int i = 0;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(opfile));
        Person person = null;
        try {
            while (true){
                person = (Person) objectInputStream.readObject();
                person.display();
                people[i++] = person;
            }
        }catch (EOFException e){
            System.out.println("People文件读到底了");
        }
    }
    void readfile(Student[] students) throws IOException, ClassNotFoundException {
        int i = 0;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(opfile));
        Student student = null;
        try {
            while (true){
                student = (Student) objectInputStream.readObject();
                student.display();
                students[i++] = student;
            }
        }catch (EOFException e){
            System.out.println("Students文件读到底了");
        }
    }
    void readfile(Teacher[] teachers) throws IOException, ClassNotFoundException {
        int i = 0;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(opfile));
        Teacher teacher = null;
        try {
            while (true){
                teacher = (Teacher) objectInputStream.readObject();
                teacher.display();
                teachers[i++] = teacher;
            }
        }catch (EOFException e){
            System.out.println("Teachers文件读到底了");
        }
    }
    void readfile(Course[] courses) throws IOException, ClassNotFoundException {
        int i = 0;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(opfile));
        Course course = null;
        try {
            while (true){
                course = (Course) objectInputStream.readObject();
                course.display();
                courses[i++] = course;
            }
        }catch (EOFException e){
            System.out.println("Courses文件读到底了");
        }
    }
    void readfile(Schedule[] schedules) throws IOException, ClassNotFoundException {
        int i = 0;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(opfile));
        Schedule schedule = null;
        try {
            while (true){
                schedule = (Schedule) objectInputStream.readObject();
                schedule.display();
                schedules[i++] = schedule;
            }
        }catch (EOFException e){
            System.out.println("Schedules文件读到底了");
        }
    }
    void readfile(Electivecourse[] electivecourses) throws IOException, ClassNotFoundException {
        int i = 0;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(opfile));
        Electivecourse electivecourse = null;
        try {
            while (true){
                electivecourse = (Electivecourse) objectInputStream.readObject();
                electivecourse.display();
                electivecourses[i++] = electivecourse;
            }
        }catch (EOFException e){
            System.out.println("Electivecourses文件读到底了");
        }
    }
    void Writefile(Person person) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(opfile, true);
        if(opfile.length() < 1) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        }
        else {
            MyObjectOutputStream myObjectOutputStream = new MyObjectOutputStream(fileOutputStream);
            myObjectOutputStream.writeObject(person);
            myObjectOutputStream.close();
        }
//
    }
    void Writefile(Student student) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(opfile, true);
        if(opfile.length() < 1) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
        }
        else {
            MyObjectOutputStream myObjectOutputStream = new MyObjectOutputStream(fileOutputStream);
            myObjectOutputStream.writeObject(student);
            myObjectOutputStream.close();
        }
//

    }
    public void Writefile(Teacher teacher) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(opfile, true);
        if(opfile.length() < 1) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(teacher);
            objectOutputStream.close();
        }
        else {
            MyObjectOutputStream myObjectOutputStream = new MyObjectOutputStream(fileOutputStream);
            myObjectOutputStream.writeObject(teacher);
            myObjectOutputStream.close();
        }
//
    }
    public void Writefile(Course course) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(opfile, true);
        if(opfile.length() < 1) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(course);
            objectOutputStream.close();
        }
        else {
            MyObjectOutputStream myObjectOutputStream = new MyObjectOutputStream(fileOutputStream);
            myObjectOutputStream.writeObject(course);
            myObjectOutputStream.close();
        }
//
    }
    public void Writefile(Schedule schedule) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(opfile, true);
        if(opfile.length() < 1) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(schedule);
            objectOutputStream.close();
        }
        else {
            MyObjectOutputStream myObjectOutputStream = new MyObjectOutputStream(fileOutputStream);
            myObjectOutputStream.writeObject(schedule);
            myObjectOutputStream.close();
        }
//
    }
    public void Writefile(Electivecourse electivecourse) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(opfile, true);
        if(opfile.length() < 1) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(electivecourse);
            objectOutputStream.close();
        }
        else {
            MyObjectOutputStream myObjectOutputStream = new MyObjectOutputStream(fileOutputStream);
            myObjectOutputStream.writeObject(electivecourse);
            myObjectOutputStream.close();
        }
//        myObjectOutputStream.flush();


    }



}
