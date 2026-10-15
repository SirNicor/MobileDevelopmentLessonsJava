package com.example.bogachlaboratory6;
import android.content.Intent;
import java.io.Serializable;
public abstract class Human implements Serializable { // класс абстрактный, у него нет экземпляров(оъектов этого типа)
    protected String firstName;
    protected String lastName;
    protected Integer age;
    Human() {
    }
    Human(String name) {
        this.firstName = name;
    }
    Human(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
    }
    Human(String name, String lastName, Integer age) {
        this.firstName = name;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String toString() {
        return String.format("Human = {firstName: %s, lastName: %s, age: %d}",
                this.firstName, this.lastName, this.age);
    }
}