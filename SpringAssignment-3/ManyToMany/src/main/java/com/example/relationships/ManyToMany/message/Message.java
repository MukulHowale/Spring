package com.example.relationships.ManyToMany.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    String msg;

    public Message(String msg) {
        this.msg = msg;
    }
}
