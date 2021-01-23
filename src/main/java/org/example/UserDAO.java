package org.example;

import java.util.List;

public interface UserDAO {

    void create(User u);

    List<User> getByFirstName(String FirstName);

    List<User> getByLastName(String LastName);

    boolean update(String id, String FirstName);

    boolean remove(String id);
}
