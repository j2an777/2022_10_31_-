package com.hallym.tdmarket.tdmarket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class FoodsStore {

    @Id @GeneratedValue
    @Column(name = "food_store_id")
    private Long id;

    private String name;
    @Embedded
    private Address address;

    @OneToMany
    private List<Image> foodStoresImage;



}
