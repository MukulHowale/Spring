package com.example.relationships.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class Messages {
    String msg;

    public Messages(String errorMsg) {
        this.msg = errorMsg;
    }
}
