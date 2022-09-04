package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws MyException{
	// write your code here
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Usonov U", 21));
        students.add(new Student("Usonov A", -21));
        students.add(new Student("", 25));
        students.add(new Student("Bakytov L", 0));
        students.add(new Student("Asanov U", 21));
        for (Student st: students  ) {
            System.out.println(st);}
        try {
            System.out.println(students.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Бутту");
        




        }

    }
}
