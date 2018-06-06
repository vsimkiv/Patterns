package com.patterns;

import com.patterns.builder.Person;

public class Demo {
    public static void main (String[] args){

        /*
         * Builder test
         */
        Person mrBuilder = Person.builder()
                .name("Volodymyr")
                .age(28)
                .phone("099-715-26-07")
                .city("IF")
                .build();

        System.out.println(mrBuilder);

    }
}
