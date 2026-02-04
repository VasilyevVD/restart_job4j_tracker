package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Victor Vasilev");
        student.setGroup("Java developer");
        student.setCreted(2024, 10, 1);

        System.out.println(student.getName() + " поступил на курс - " + student.getGroup()
                + " в " + student.getCreted());
    }
}
