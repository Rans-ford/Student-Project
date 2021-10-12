package tlc.com.company;

import java.util.List;

public class NaughtyStudents extends Student {
    public NaughtyStudents(List<Double> studentGrades) {
        super(studentGrades);
    }

    @Override
    public double getAGrades() {
       double increasedAverageGrade;
       increasedAverageGrade = super.getAGrades() + (super.getAGrades() * 0.1);
       return increasedAverageGrade;
    }
}
