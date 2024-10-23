package com.example.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    // Initialize the list before each test
    @BeforeEach
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }

    // Test to verify adding a city increases the size of the list
    @Test
    public void addCityTest() {
        int initialSize = list.getCount();  // Get initial size of the list
        list.addCity(new City("Toronto", "ON"));  // Add a new city
        assertEquals(initialSize + 1, list.getCount());  // Expect size to increase by 1
    }
}
