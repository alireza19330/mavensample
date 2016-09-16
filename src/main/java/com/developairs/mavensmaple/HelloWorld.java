package com.developairs.mavensmaple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alireza on 8/5/16.
 */
public class HelloWorld {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanFactory factory = context;
        MySpringBeanWithDependency test = (MySpringBeanWithDependency) factory
                .getBean("mySpringBeanWithDependency");
        test.run();
    }
}
