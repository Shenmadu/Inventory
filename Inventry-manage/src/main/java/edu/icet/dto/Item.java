package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data            //getters setters generate
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String name;
    private double price;

}
