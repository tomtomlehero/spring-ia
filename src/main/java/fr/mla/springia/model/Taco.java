package fr.mla.springia.model;

import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private final String name;
    private final List<String> ingredients;

}
