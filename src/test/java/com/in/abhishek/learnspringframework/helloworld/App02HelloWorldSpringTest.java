package com.in.abhishek.learnspringframework.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = HelloWorldConfiguration.class)
@TestPropertySource(properties = {"name=John"})
class App02HelloWorldSpringTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testApplicationContext() {
        assertNotNull(context, "ApplicationContext should not be null");
    }

    @Test
    void testNameBean() {
        String name = context.getBean(String.class);
        assertNotNull(name, "Name bean should not be null");
    }

    @Test
    void testPersonBean() {
        Person person = context.getBean(Person.class);
        assertNotNull(person, "Person bean should not be null");
        assertNotNull(person.address(), "Person's address should not be null");
    }

    @Test
    void testAddressBean() {
        Address address = context.getBean(Address.class);
        assertNotNull(address, "Address bean should not be null");
    }
}
