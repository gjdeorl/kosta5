package kosta.common;


import kosta.BoundedContext657Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext657Application.class })
public class CucumberSpingConfiguration {
    
}
