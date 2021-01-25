package org.example;

import javax.persistence.*;

@Entity
@Table(name= "Users")
public class User {

    @Id
    private String ID;

    private String FirstName;
    private String LastName;

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
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

    public User(String ID, String firstName, String lastName) {
       this.ID = ID;
       this.FirstName = firstName;
       this.LastName = lastName;
    }

    public User() {
    }

    @Override
    public String toString()  {
        return "User [id=" + ID + "/First Name=" + FirstName + "/Last Name=" + LastName + "]"; }
}