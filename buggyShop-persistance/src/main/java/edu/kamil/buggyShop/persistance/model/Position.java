package edu.kamil.buggyShop.persistance.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "POSITION", schema = "buggyshop")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POSITION_ID")
    private int id;

    @Column(name = "QUANTITY")
    private float quantity;

    @Column(name = "VALUE")
    private float value;

    @Column(name = "INVOICE_ID")
    private int ARTICLE_CODE;

    @Column(name = "INVOICE_ID")
    private int invoiceId;

    @Column(name = "CLIENT_ID")
    private int clientId;

}
