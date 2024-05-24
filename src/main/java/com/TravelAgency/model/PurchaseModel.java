package com.TravelAgency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseModel {

    private TourModel tour;
    private String FirstName;
    private String LastName;
    private String passportNR;
    private Date birthday;
    private Date passportExpiryDate;
    private Double amount;


}
