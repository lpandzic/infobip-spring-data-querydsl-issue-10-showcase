package com.github.lpandzic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class Issue10Showcase {

    @Test
    void shouldCreateQClassForPerson() throws ClassNotFoundException {

        then(Person.class.getDeclaredConstructors()).hasSize(1);
        then(Person.class.getDeclaredConstructors()[0].getParameterCount()).isEqualTo(1);
        then(new Person(1)).isEqualTo(new Person(1));
        then(getClass().getClassLoader().loadClass("com.github.lpandzic.QPerson")).isNotNull();
    }
}
