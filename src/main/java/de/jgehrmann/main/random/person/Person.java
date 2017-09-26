package de.jgehrmann.main.random.person;

/**
 * Created by jgehrmann on 25.09.17.
 */
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private int height;
    private int weight;

    public Person(String firstname, String lastname, int age, int height, int weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
