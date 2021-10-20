package com.example.relationships.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class Errors {
    String errorMsg;

    public Errors(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
