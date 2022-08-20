package com.moseswilliamsiii.realestate.repository;

import com.moseswilliamsiii.realestate.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepo extends JpaRepository<House, String> {
}
