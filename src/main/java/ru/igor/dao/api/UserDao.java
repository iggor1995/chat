package ru.igor.dao.api;

import ru.igor.entity.User;
import ru.igor.entity.message.Message;

public interface UserDao {

    public User create(User user);

    public void delete(Long id);
}
