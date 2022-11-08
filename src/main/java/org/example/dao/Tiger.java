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
public class Tiger implements Animal{
    @Value("${tiger.breed}")
    private String breed;

    @Value("${tiger.color}")
    private String color;

    @Value("${tiger.weight}")
    private double weight;

    public void animalPlus() {
        System.out.println("animalPlus");
    }

    public void animalMinus() {
        System.out.println("animalMinus");
    }
}
