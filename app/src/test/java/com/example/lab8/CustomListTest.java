package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        int initialSize = list.getCount();  // Get initial size of the list
        list.addCity(new City("Toronto", "ON"));  // Add a new city
        assertEquals(initialSize + 1, list.getCount());  // Expect size to increase by 1
    }
}
