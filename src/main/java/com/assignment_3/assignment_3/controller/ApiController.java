package com.assignment_3.assignment_3.controller;

import com.assignment_3.assignment_3.dto.AvgSalesPerLocation;
import com.assignment_3.assignment_3.model.House;
import com.assignment_3.assignment_3.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class ApiController {

    @Autowired
    private HouseService houseService;
    @PostMapping("/save-data")
    public ResponseEntity<List<House>> saveAllHouse(@RequestBody List<House> houses){
        List<House> houseList = houseService.saveAllHouse(houses);
        return ResponseEntity.status(HttpStatus.CREATED).body(houseList);
    }
    @GetMapping("/avg-sale")
    public ResponseEntity<Double> findAvgSale(){
        Double avgSale = houseService.findAvgSale();
        return ResponseEntity.ok(avgSale);
    }
    @GetMapping("/avg-sale-per-location")
    public ResponseEntity<List<Map<String, Double>>> avgSalePerLocation(){
        List<Map<String, Double>> avgSalesPerLocations = houseService.avgSalesPerLocations();
        return ResponseEntity.ok(avgSalesPerLocations);
    }
    @GetMapping("/get-max-sale")
    public ResponseEntity<Integer> getMAxSale(){
        Integer maxSales = houseService.getMaxSales();
        return ResponseEntity.ok(maxSales);
    }
    @GetMapping("/get-min-sale")
    public ResponseEntity<Integer> getMinSale(){
        Integer minSales = houseService.getMinSales();
        return ResponseEntity.ok(minSales);
    }
}
