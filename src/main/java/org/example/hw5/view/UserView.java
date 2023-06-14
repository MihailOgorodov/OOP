package org.example.hw5.view;

import org.example.hw5.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //GET

    void create(String fullName, Integer age, String phoneNumber); //POST

    void removeUser(String fullName); //DELETE
}
