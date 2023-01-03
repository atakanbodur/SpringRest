package com.edu.ozyegin.cs393.project;

import com.edu.ozyegin.cs393.project.controller.CarController;
import com.edu.ozyegin.cs393.project.dto.CarDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest()
@AutoConfigureMockMvc
public class CarControlerTest {
    @Autowired
    CarController carController;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getCarCount(){
        try {
            MvcResult result = this.mockMvc.perform(get("/cars")).andExpect(status().isOk())
                    .andReturn();
            ObjectMapper mapper = new ObjectMapper();
            List<CarDTO> cars = mapper.readValue(result.getResponse().getContentAsString(), new TypeReference<List<CarDTO>>() {});
            System.out.println("cars.size() = " + cars.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void getAvailableCars(){
        try {
            MvcResult result = this.mockMvc.perform(get("/cars/searchAvailable/SUV/AUTO")).andExpect(status().isOk())
                    .andReturn();
            ObjectMapper mapper = new ObjectMapper();
            List<CarDTO> cars = mapper.readValue(result.getResponse().getContentAsString(), new TypeReference<List<CarDTO>>() {});
            System.out.println("Available Cars = " + cars.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
