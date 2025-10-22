package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void greetsWorldByDefault() {
        assertEquals("Hello, world!", Hello.greet(null));
        assertEquals("Hello, world!", Hello.greet(""));
    }

    @Test
    void greetsByName() {
        assertEquals("Hello, Haley!", Hello.greet("Haley"));
    }
}
