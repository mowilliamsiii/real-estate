package com.moseswilliamsiii.realestate.controllers;

import com.moseswilliamsiii.realestate.exceptions.CustomHouseException;
import com.moseswilliamsiii.realestate.model.House;
import com.moseswilliamsiii.realestate.repository.HouseRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class HouseControllerTestNew {


        @Test
        void getHouses() {
            HouseRepo houseRepo = Mockito.mock(HouseRepo.class);
            HouseController houseController = new HouseController(houseRepo);
            List<House> houses = new ArrayList<>();
            houses.add(new House("1","La La Lane",123,"Gotham","A5"));

            when(houseController.getHouses()).thenReturn(houses);
            assertEquals(new CustomHouseException("No houses"),houseController.getHouses());

    /*

    insert into house
(id,street_name, street_number, city_name, apartment_number)
    values('1','La La Lane', 123,'Gotham','A5' );
    */
    }
}