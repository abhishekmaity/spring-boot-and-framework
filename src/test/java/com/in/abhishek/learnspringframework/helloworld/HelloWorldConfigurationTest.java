package com.in.abhishek.learnspringframework.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = HelloWorldConfiguration.class)
class HelloWorldConfigurationTest {

    @Autowired
    private String name;

    @Autowired
    private int age;

    @Autowired
    private Person person;

    @Autowired
    private Address address;

    @Autowired
    private Address address2;

    @Autowired
    private Address address3;

    @Test
    void testStringBean() {
        assertNotNull(name, "Name bean should not be null");
        assertEquals("Abhishek", name, "Name should be 'Abhishek'");
    }

    @Test
    void testIntBean() {
        assertEquals(30, age, "Age should be 30");
    }

    @Test
    void testPersonBean() {
        assertNotNull(person, "Person bean should not be null");
        assertEquals("Aman", person.name(), "Person's name should be 'Aman'");
        assertEquals(35, person.age(), "Person's age should be 35");
        assertNotNull(person.address(), "Person's address should not be null");
    }

    @Test
    void testAddressBeans() {
        assertNotNull(address, "Address bean should not be null");

        assertNotNull(address2, "Address2 bean should not be null");

        assertNotNull(address3, "Address3 bean should not be null");

    }
}
