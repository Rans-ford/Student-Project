package tlc.com.company;


import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private final List<Nameable> studentNames;
    public Register(List<Nameable> nameableList){
        this.studentNames = nameableList;
    }

    public List<String> getRegister(){
        return studentNames.stream()
                .map(Nameable::getName)
                .collect(Collectors.toList());
    }
}
