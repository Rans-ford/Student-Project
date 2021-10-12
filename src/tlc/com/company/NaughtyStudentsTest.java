package tlc.com.company;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentsTest {

    @org.junit.jupiter.api.Test
    void getAGrades() {
        List<Double> gradeList = new ArrayList<>();
        Student student = new NaughtyStudents(gradeList);
        Student student1 = new Student(gradeList);
        gradeList.add(10.0);
        gradeList.add(20.0);
        gradeList.add(30.0);
        gradeList.add(40.0);
        gradeList.add(50.0);
        assertEquals(30, student1.getAGrades());
        assertEquals(30, student.getAGrades());
    }
}