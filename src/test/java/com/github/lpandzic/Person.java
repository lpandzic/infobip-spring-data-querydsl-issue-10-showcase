package com.github.lpandzic;

import lombok.Value;
import org.springframework.data.annotation.Id;

@Value
public class Person {

    @Id
    private final Integer id;
}
