package com.springintro.empdepartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//        EmployeeBean employee = context.getBean(EmployeeBean.class);
//        employee.showEmployeeDetails();  // Output: Employee works in Department: Software Development
    }
}



