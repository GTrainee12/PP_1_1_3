package model;

import javax.persistence.*;

@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Last Name")
    private String lastName;

    @Column(name = "Age")
    private Byte age;

    public User(Long id, String name, String lastName, Byte age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return String.format("User: {id = '%s', name = '%s', lastName = '%s', age = '%d'}", id, name, lastName, age);
    }


    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Byte getAge() {
        return this.age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

}