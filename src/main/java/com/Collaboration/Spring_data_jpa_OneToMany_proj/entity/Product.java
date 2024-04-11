package com.Collaboration.Spring_data_jpa_OneToMany_proj.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int pid;
  private String pname;
  private int qty;
  private int price;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "cid_fk" )
  private Customer customer;
}
