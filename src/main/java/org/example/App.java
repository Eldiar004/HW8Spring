package org.example;

import org.example.dao.Animal;
import org.example.dao.Config;
import org.example.dao.Person;
import org.example.dao.Tiger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Animal animal = context.getBean("tiger" , Tiger.class);
        Person person1 = context.getBean("person" , Person.class);
        person1.setAnimal(animal);
        System.out.println(person1);
        Tiger tiger = context.getBean("tiger" , Tiger.class);
        Person person2 = context.getBean("person" , Person.class);
        person2.setAnimal(tiger);
        System.out.println(person2);
    }
}