package org.example.demospringdata.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "PRODUITS")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Produit {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private  double price;
    private double quantity;
}
