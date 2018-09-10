package ru.igor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.igor.dao.api.UserDao;
import ru.igor.entity.User;
import ru.igor.service.api.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(@Qualifier("userDao") UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User register(User user) {
        return userDao.create(user);
    }
}
