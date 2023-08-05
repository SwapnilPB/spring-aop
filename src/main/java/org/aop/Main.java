package org.aop;

import org.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService service = context.getBean("shape", ShapeService.class);
        System.out.println(service.getCircle().getName());
    }
}