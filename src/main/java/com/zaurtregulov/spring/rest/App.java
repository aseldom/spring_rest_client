package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        for(Employee e : allEmployees) {
//            System.out.println(e);
//        }
//
//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Svetova", "HR", 1400);
//        employee.setId(21);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(21);


    }
}
