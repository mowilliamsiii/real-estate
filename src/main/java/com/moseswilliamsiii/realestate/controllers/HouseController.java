package com.moseswilliamsiii.realestate.controllers;

import com.moseswilliamsiii.realestate.exceptions.CustomHouseException;
import com.moseswilliamsiii.realestate.model.House;
import com.moseswilliamsiii.realestate.repository.HouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HouseController {

    @Autowired
    private HouseRepo houseRepo;


    public HouseController(HouseRepo houseRepo) {
        this.houseRepo = houseRepo;
    }

    //GET
    @GetMapping("/houses")
    public List<House> getHouses(){

        List<House> houseList = houseRepo.findAll();

        if(houseList.isEmpty()){
            throw new CustomHouseException("No houses");
        }else {
        return houseList;}
    }

    //POST
    @PostMapping("/houses")
    public House createHouse(@RequestBody House house){
        House savedHouse = houseRepo.save(house);

        return savedHouse;
    }


    //DELETE
    @DeleteMapping("/houses/{id}")
    public void deleteHouseById(@PathVariable String id) throws CustomHouseException {

        houseRepo.deleteById(id);
    }
}
