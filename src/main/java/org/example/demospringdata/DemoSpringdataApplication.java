package org.example.demospringdata;

import org.example.demospringdata.entities.Produit;
import org.example.demospringdata.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoSpringdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringdataApplication.class, args);

    }
    @Bean
    CommandLineRunner start(ProduitRepository produitRepository){
        return args -> {
            Produit p1 = new Produit();
            p1.setName("Computer");
            p1.setPrice(3400);
            p1.setQuantity(2);
            Produit p2 = new Produit(null,"Printer",1200,13);
            Produit p3 = Produit.builder()
                    .name("SmartPhone").price(1300).quantity(4)
                    .build();
            produitRepository.save(p1);
            produitRepository.save(p2);
            produitRepository.save(p3);

            List<Produit> produits = produitRepository.findAll();
            produits.forEach(p->{
                System.out.println(p.toString());
            });
        };
    }
}
