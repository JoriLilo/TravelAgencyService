package com.TravelAgency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityModel {

    private Integer id;

    private String cityName;
    private String nationality;
}
