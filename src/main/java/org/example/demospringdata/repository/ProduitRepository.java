package org.example.demospringdata.repository;

import org.example.demospringdata.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    List<Produit> findByNameContains(String kw);
}
