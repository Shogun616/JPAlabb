package org.example;

import javax.persistence.*;

@Entity
@Table(name= "Users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;
    private String FirstName;
    private String LastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public User(String id, String firstName, String lastName) {
       this.id = id;
       this.FirstName = firstName;
       this.LastName = lastName;
    }

    public User() {
    }

    @Override
    public String toString()  {
        return "[" + id + "/" + FirstName + "/" + LastName + "]"; }
}