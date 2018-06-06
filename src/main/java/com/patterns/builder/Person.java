package com.patterns.builder;

public class Person {
    private String name;
    private int age;
    private String phone;
    private String city;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Mr.Builder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private Person person;

        private PersonBuilder() {
            person = new Person();
        }

        public PersonBuilder name(String name) {
            person.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder phone(String phone) {
            person.phone = phone;
            return this;
        }

        public PersonBuilder city(String city) {
            person.city = city;
            return this;
        }


        public Person build() {
            return person;
        }

    }
}
