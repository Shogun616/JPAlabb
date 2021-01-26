package org.example;

import javax.persistence.*;

@Entity
@Table(name= "Users")
public class User {

    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String ID;

    private String UserName;
    private String FirstName;
    private String LastName;
    private String Email;

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
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    public User(String ID, String UserName, String firstName, String lastName, String Email) {
       this.ID = ID;
       this.UserName = UserName;
       this.FirstName = firstName;
       this.LastName = lastName;
       this.Email = Email;
    }

    public User() {
    }

    @Override
    public String toString()  {
        return "User [id=" + ID + "/First Name=" + FirstName + "/Last Name=" + LastName + "]"; }
}