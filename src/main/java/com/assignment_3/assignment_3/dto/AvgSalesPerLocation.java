package com.assignment_3.assignment_3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvgSalesPerLocation {
    private String location;
    private double avgSale;
}
