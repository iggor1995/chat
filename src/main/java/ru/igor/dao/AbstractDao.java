package ru.igor.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;

public class AbstractDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getCurrentSession() {return sessionFactory.getCurrentSession();}

    protected Criteria createBlankCriteria(Class clazz) {return getCurrentSession().createCriteria(clazz);}
}
