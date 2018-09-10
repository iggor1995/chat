package ru.igor.dao.impl;

import org.springframework.stereotype.Repository;
import ru.igor.dao.AbstractDao;
import ru.igor.dao.api.UserDao;
import ru.igor.entity.User;

@Repository(value = "userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

    @Override
    public User create(User user) {
        getCurrentSession().save(user);

        return user;
    }

    @Override
    public void delete(Long id) {

    }
}
