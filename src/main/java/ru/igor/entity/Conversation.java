package ru.igor.entity;

import ru.igor.entity.message.Message;

import java.util.List;

public class Conversation {

    private Long id;
    private List<Message> messages;
    private List<Long> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Long> getUsers() {
        return users;
    }

    public void setUsers(List<Long> users) {
        this.users = users;
    }
}
