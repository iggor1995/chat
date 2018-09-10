package ru.igor.dao.impl;

import org.springframework.stereotype.Repository;
import ru.igor.dao.AbstractDao;
import ru.igor.dao.api.MessageDao;
import ru.igor.entity.message.Message;

@Repository(value = "messageDao")
public class MessageDaoImpl extends AbstractDao implements MessageDao {

    @Override
    public Message create(Message message) {
        Long messageId = (Long) getCurrentSession().save(message);

        return message;
    }

    @Override
    public void delete(Long id) {

    }
}
