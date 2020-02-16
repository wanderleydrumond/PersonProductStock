package model;

public class Person {
    private String name;
    private int age;
    private char gender;

    public void read(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String print(){
        return name + ", " + this.age + ", " + this.gender;
    }
}