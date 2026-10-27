package org.example.demospringdata.web;

import org.example.demospringdata.entities.Produit;
import org.example.demospringdata.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitRestController {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping("/products")
    public List<Produit> allProducts(){
        return produitRepository.findAll();
    };
    @GetMapping("/product/{id}")
    public Produit findBuId(@PathVariable Long id){
        return produitRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Product Not Found"));
    };
}
