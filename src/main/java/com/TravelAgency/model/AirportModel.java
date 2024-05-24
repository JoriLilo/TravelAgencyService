package com.TravelAgency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportModel {

    private Integer id;

    private String airportName;
    private String designatedCity;
}
