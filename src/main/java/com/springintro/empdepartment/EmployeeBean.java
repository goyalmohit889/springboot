package com.springintro.empdepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeBean {

    private DepartmentBean department;

    // Constructor-based Injection (preferred)
    @Autowired

    public EmployeeBean(DepartmentBean department) {
        this.department = department;
    }
    @GetMapping("/details")
    public void showEmployeeDetails() {
        System.out.println("Employee works in Department: " + department.getDeptName());
    }
}


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Service
//@RequestMapping("/employee")
//public class EmployeeBean {
//
//    private static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
//
//    @Autowired
//    private DepartmentBean department;
//    @GetMapping("/details")
//    public void showEmployeeDetails() {
//        String dept = department.getDeptName();
//        logger.info("Showing employee details");
//        System.out.println("Employee works in Department: " + dept);
//    }
//}
