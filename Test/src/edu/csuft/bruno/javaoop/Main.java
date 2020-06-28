package edu.csuft.bruno.javaoop;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(12);
        stu.setGender("男");
        stu.setID(1000);
        stu.setName("LiMing");
        System.out.print(stu.toString());

    }
}
