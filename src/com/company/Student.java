package com.company;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        try {
            if (age < 0) {
                throw new MyException("Жашы терс сан болбош керек.", age);

            } else if (name.isEmpty() || (age < 1)) {
                throw new MyException("Атын бер же жашы ката жазылган");
            } else {
                this.name = name;
                this.age = age;
            }
        }
        catch (MyException e) {
            e.printStackTrace();
        }

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
        try {
            if (age < 0) {
                throw new MyException("Жашы терс сан болбош керек.", age);
            } else this.age = age;
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age ;
    }
}
