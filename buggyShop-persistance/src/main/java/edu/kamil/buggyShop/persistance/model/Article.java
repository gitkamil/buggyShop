package edu.kamil.buggyShop.persistance.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ARTICLE", schema = "buggyshop")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ARTICLE_CODE")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "QUANTITY")
    private float quantity;

    @Column(name = "PRICE")
    private float price;

    public Article(String name, float quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
