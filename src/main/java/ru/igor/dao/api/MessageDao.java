package ru.igor.dao.api;

import ru.igor.entity.Student;
import ru.igor.entity.message.Message;

import java.util.List;

public interface MessageDao {

    public Message create(Message message);

    public void delete(Long id);

}
