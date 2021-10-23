package kg.itacademy.securitylesson.service;

import kg.itacademy.securitylesson.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);

    List<User> getAll();

    User getCurrentUser();

    User getByUsername(String username);
}
