package org.example.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Person {

    private Animal animal;
    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;
}
