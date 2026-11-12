package kh.edu.istad.b02restapi.service;

import kh.edu.istad.b02restapi.model.User;

import java.util.List;
import java.util.UUID;

public interface

UserService {

    List<User> getAll();

    User getById(UUID id);
    User create(User user);
    void deleteById(UUID id);

}
