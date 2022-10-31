package com.hallym.tdmarket.tdmarket.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "markets")
@Getter @Setter
@NoArgsConstructor
public class TraditionalMarket {

    @Id @GeneratedValue
    @Column(name = "market_id")
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Image> images = new ArrayList<>();
    private String foods;
    private String parking;
    private String traffic;
    private String opening;
    private String phoneNum;
    private String Sights;
    private String facilites;
    @Embedded
    private Address address;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "maket_content_id")
    private TraditionalMarketContent traditionalMarketContent;

}
