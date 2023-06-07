package org.example.hw4.view;

import org.example.hw4.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber); //POST
    void removeUser(String fullName); //DELETE
}
