package com.moseswilliamsiii.realestate.controllers;



import com.moseswilliamsiii.realestate.services.HouseService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class HouseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HouseService houseService;


    @Test
    void getHouses() throws Exception {
        mockMvc.perform(get("/houses"))
                .andDo(print())
                .andExpect(status().isOk());
    }



}