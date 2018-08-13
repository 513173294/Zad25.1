package com.example.demo;

import javax.persistence.*;
import java.util.List;


@Entity
public class Mieszkaniec {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String sex;




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}