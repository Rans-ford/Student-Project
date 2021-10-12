package tlc.com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Student implements Nameable{
    protected List<Double> studentGrade;
    private String name;

    public Student (List<Double> studentGrades){
        this.studentGrade = studentGrades;
    }
    public Student (String name, List<Double> studentGrades){
        this(studentGrades);
        this.name = name;

    }

//    public double getAverageGrades (){
//        double totalGrades = 0;
//        if(!studentGrade.isEmpty()){
//            for (Double averageGrade : studentGrade) {
//                totalGrades +=  averageGrade;
//            }
////            return totalGrades/studentGrade.size();
//            totalGrades= totalGrades/studentGrade.size();
//        }
//        return totalGrades;
//    }

    public double getAGrades(){
        double average;
        average = studentGrade.stream()
                .mapToDouble(q -> q)
                .average()
                .orElse(0.0);
        return average;

    }

    @Override
    public String getName() {
        return this.name;
    }
}
