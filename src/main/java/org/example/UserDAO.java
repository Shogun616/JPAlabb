package org.example;

import java.util.List;

public interface UserDAO {

    void create(User u);

    List<User> getByFirstName(String Name);

    List<User> getByLastName(String Name);

    boolean updateByFirstName(String id, String Name);

    boolean updateByLastName(String id, String Name);

    boolean updateByUserName(String id, String Name);

    boolean remove(String id);
}