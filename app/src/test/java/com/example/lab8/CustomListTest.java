package com.example.lab8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;


    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }


    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "Alberta");


        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Calgary", "Alberta");
        list.addCity(city);

        assertTrue(list.hasCity(city));

        list.deleteCity(city);
        Assertions.assertFalse(list.hasCity(city));
    }

    @Test
    public void countCityTest() {
        list = MockCityList();
        assertEquals(0, list.countCity()); // Initially 0

        list.addCity(new City("Toronto", "Ontario"));
        assertEquals(1, list.countCity()); // Should be 1

        list.addCity(new City("Vancouver", "BC"));
        assertEquals(2, list.countCity()); // Should be 2
    }



}
