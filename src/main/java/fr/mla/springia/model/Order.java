package fr.mla.springia.model;

import lombok.Data;

@Data
public class Order {

    private final String name;
    private final String street;
    private final String city;
    private final String state;
    private final String zip;
    private final String ccNumber;
    private final String ccExpiration;
    private final String ccCVV;
}
