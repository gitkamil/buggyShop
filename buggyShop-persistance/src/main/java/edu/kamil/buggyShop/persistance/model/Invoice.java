package edu.kamil.buggyShop.persistance.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "INVOICE", schema = "buggyshop")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_ID")
    private int id;

    @Column(name = "ISSUE_DATE")
    private Date issueDate;

    @Column(name = "VALUE")
    private float value;

    @Column(name = "CLIENT_ID")
    private int clientId;

}
