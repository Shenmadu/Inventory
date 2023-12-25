package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Item")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //id auto generate
    private Long id;
    private String name;
    private double price;

}
