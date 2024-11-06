package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return String.format("User: {id = '%s', name = '%s', lastName = '%s', age = '%d'}", id, name, lastName, age);
    }

}