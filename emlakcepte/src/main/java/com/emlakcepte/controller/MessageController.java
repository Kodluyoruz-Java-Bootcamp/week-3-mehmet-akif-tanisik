package com.emlakcepte.controller;


import com.emlakcepte.model.Message;
import com.emlakcepte.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAll(){
        System.out.println("getAll() MessageService :: " + messageService);
        return messageService.getAll();
    }

    @PostMapping
    public ResponseEntity<Message> create(@RequestBody Message message){
        messageService.createMessage(message);
        System.out.println("create() MessageService :: " + messageService);

        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping("/{title}")
    public ResponseEntity<Message> update(@PathVariable String title, @RequestBody Message message){

        messageService.updateMessage(title, message);
        return new ResponseEntity<>(message, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<String> delete(@PathVariable String title){

        messageService.deleteMessage(title);

        return new ResponseEntity<>(title, HttpStatus.OK);
    }


}
