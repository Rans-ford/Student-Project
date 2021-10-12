package tlc.com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Double> gradeList = new ArrayList<>();
        Student student = new Student(gradeList);
        gradeList.add(34.0);
        gradeList.add(25.0);
        gradeList.add(35.0);
        gradeList.add(50.0);
        gradeList.add(34.0);
        System.out.println(student.getAGrades());
        System.out.println("==============================");

        List<Double> gradeList1 = new ArrayList<>();
        Student student1 = new Student(gradeList1);
        gradeList1.add(50.0);
        gradeList1.add(70.0);
        gradeList1.add(66.0);
        gradeList1.add(65.0);
        gradeList1.add(25.0);
        System.out.println(student1.getAGrades());

        Lecture lecture = new Lecture();
        lecture.enter(student);
        lecture.enter(student1);
        System.out.println("The highest Average is " + lecture.getTheHighestAverageGrade());

    }
}
