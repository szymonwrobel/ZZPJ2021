package zzpj;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;
    private String surname;
    private int age;

    public void printInfo() {
        System.out.println("Hello I'm " + name + " " + surname + " and I'm " + age + "!");
    }
}