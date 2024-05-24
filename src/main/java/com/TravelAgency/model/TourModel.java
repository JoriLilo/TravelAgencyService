package com.TravelAgency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourModel {

    private Integer id;
    private String cityWhereFrom;
    private String airportWhereFrom;

    private String cityWhereTo;
    private String airportWhereTo;

    private Date departureDate;
    private Date dateOfReturn;
    private Integer numberOfDays;
    private HotelType hotelType;
    private Double priceForAnAdult;
    private Double priceForAChild;
    private boolean promoted;
    private Integer numberOfAdult;
    private Integer numberOfChildren;


}
