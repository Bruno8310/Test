package edu.csuft.bruno.javaoop;

public class Student {
    String name;
    int age;
    String gender;
    int ID;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Student(String name, int age, String gender, int ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ID=" + ID +
                '}';
    }
}
