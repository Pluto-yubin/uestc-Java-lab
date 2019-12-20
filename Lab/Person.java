package Lab;

import java.io.Serializable;

class Person implements Serializable {
    protected String name;
    protected  String sex;
    protected int age;
    Person(String name, String sex, int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public  void display(){
        System.out.println("Name: " + getName());
        System.out.println("Sex: " + getSex());
        System.out.println("age: " + getAge());
    }
}


