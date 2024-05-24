package com.TravelAgency.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelModel {

    private Integer id;
    private String  hotelName;
    private Integer standard;
    private String description;
    private String designatedCity;

}
