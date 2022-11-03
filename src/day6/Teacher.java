package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int max = 6;
        int min = 2;
        int value = 2 + (int) (Math.random() * 5);
        String valueString = null;
        switch (value) {
            case 2:
                valueString = "неудовлетворительно";
                break;
            case 3:
                valueString = "удовлетворительно";
                break;
            case 4:
                valueString = "хорошо";
                break;
            case 5:
                valueString = "отлично";

        }
        System.out.println("Преподаватель " + getName() + " оценит студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку "
                + valueString);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Annet", "Math");
        Student student = new Student("Alex");

        teacher.evaluate(student);
    }
}
