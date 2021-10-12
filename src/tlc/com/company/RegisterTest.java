package tlc.com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    Register register;
    @BeforeEach
    void setUp(){
      this.register = new Register(
           List.of(
                   new Student("Adwoa", Arrays.asList(1.0,2.0,3.0,4.0)),
                   new Student("Ransford", Arrays.asList(15.0,25.0,35.0,45.0)),
                   new Student("Matin", Arrays.asList(10.0,20.0,30.0,40.0)),
                   new Student("Osbourne", Arrays.asList(14.0,24.0,34.0,44.0)),
                   new Student("Alexander", Arrays.asList(1.0,2.0,3.0,4.0))

           )
        );
    }

    @Test
    void getRegister() {
        this.register.getRegister();
           }
}