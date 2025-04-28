package com.springintro.empdepartment;


import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    public String getDeptName() {
        return "Software Development";
    }
}

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DepartmentBean {
//
//    private static final Logger logger = LoggerFactory.getLogger(DepartmentBean.class);
//
//    public String getDeptName() {
//        logger.info("Returning department name");
//        return "Software Development";
//    }
//}
