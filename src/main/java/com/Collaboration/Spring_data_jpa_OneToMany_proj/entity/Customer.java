package com.Collaboration.Spring_data_jpa_OneToMany_proj.entity;

import lombok.*;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "pid_fk", referencedColumnName = "cid")
//    private Product product;
    private List<Product> products;

}
