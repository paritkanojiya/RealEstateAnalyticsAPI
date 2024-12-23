package com.assignment_3.assignment_3.repository;

import com.assignment_3.assignment_3.dto.AvgSalesPerLocation;
import com.assignment_3.assignment_3.model.House;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HouseRepo extends JpaRepository<House,Integer> {
    @Query(value = "SELECT AVG(sale_price) FROM house",nativeQuery = true)
    Double avgSale();
    @Query(value = "SELECT location,AVG(sale_price) as avgSale FROM house GROUP BY location",nativeQuery = true)
    List<Map<String,Double>> avgSalePerLocation();
    @Query(value = "SELECT MAX(sale_price) FROM house",nativeQuery = true)
    Integer getMaxSales();
    @Query(value = "SELECT MIN(sale_price) FROM house",nativeQuery = true)
    Integer getMinSales();
}
