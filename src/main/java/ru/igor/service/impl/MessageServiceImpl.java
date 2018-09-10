package ru.igor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.igor.dao.api.MessageDao;
import ru.igor.entity.message.Message;
import ru.igor.service.api.MessageService;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    private final MessageDao messageDao;

    @Autowired
    public MessageServiceImpl(@Qualifier("messageDao") MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    @Override
    public Message save(Message message) {
        return messageDao.create(message);
    }
}
