package com.assignment_3.assignment_3.service;

import com.assignment_3.assignment_3.dto.AvgSalesPerLocation;
import com.assignment_3.assignment_3.model.House;
import com.assignment_3.assignment_3.repository.HouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HouseService {
    
    @Autowired
    private HouseRepo houseRepo;
    
    public List<House> saveAllHouse(List<House> houses){
        return houseRepo.saveAll(houses);
    }
    public Double findAvgSale(){
        return houseRepo.avgSale();
    }
    public List<Map<String,Double>> avgSalesPerLocations(){
        return houseRepo.avgSalePerLocation();
    }
    public Integer getMaxSales(){
        return houseRepo.getMaxSales();
    }
    public Integer getMinSales(){
        return houseRepo.getMinSales();
    }
}
