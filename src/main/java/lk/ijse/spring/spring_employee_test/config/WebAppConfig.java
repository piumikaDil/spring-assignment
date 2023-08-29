package lk.ijse.spring.spring_employee_test.config;

import lk.ijse.spring.spring_employee_test.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackageClasses = WebAppInitializer.class)
public class WebAppConfig {
}
