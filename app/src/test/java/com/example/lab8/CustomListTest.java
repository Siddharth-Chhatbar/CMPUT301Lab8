package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist fro my citylist
     * @return
     */

    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * chick if our current size matches the initial size plus one
     */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan","SK"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Edmonton","AB");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }
    @Test
    public void countCitiesTest(){
        list = MockCityList();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(),list.countCities());
    }

}
