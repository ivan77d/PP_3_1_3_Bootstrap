package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService {

    List<User> allUsers();

    User userById(int id);

    void save(User user);

    void update(User user);

    void delete(int id);

    User getUserByLogin(String username);
}