package com.emlakcepte.repository;


import com.emlakcepte.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageRepository {

    @Autowired
    private static List<Message> messageList = new ArrayList<>();



    public void saveMessage(Message message){
        messageList.add(message);
    }

    public List<Message> getAll(){
        return messageList;
    }

    public void updateMessage(String title, Message message){

        Message tempMessage = messageList.stream().filter(msg -> msg.getTitle().equals(title)).findFirst().get();
        messageList.remove(tempMessage);
        messageList.add(message);
    }

    public void deleteMessage(String title){
        Message tempMessage = messageList.stream().filter(msg -> msg.getTitle().equals(title)).findFirst().get();
        messageList.remove(tempMessage);
    }



}
