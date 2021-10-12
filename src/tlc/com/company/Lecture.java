package tlc.com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    List<Double> studentAverageGrade = new ArrayList<>();
      public void enter (Student student){
        this.studentAverageGrade.add(student.getAGrades());
    }

    public double getTheHighestAverageGrade(){
        return Collections.max(studentAverageGrade);
    }
}
