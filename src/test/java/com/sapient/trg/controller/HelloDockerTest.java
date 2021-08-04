package com.sapient.trg.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sapient.trg.model.Greeting;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class HelloDockerTest {
    @InjectMocks
    HelloDocker helloDocker;
     
                
    @Test
    public void testFindAll()     {
        // given
        Greeting greeting1 = new Greeting("Good Morning!");
        Greeting greeting2= new Greeting("Good Evening!");
        Greeting greeting3= new Greeting("Good Night!");
        List<Greeting> greetingList= new ArrayList<>();
        greetingList.add(greeting1);greetingList.add(greeting2);
        greetingList.add(greeting3);
 
//        when(greetingList.get(0)).thenReturn(greeting1);
 
        // when
        Greeting result = helloDocker.sayHello().getBody();
 
        // then
        assertThat(result.getMessage().equals("Good Morning!"));
         
       
    }
}