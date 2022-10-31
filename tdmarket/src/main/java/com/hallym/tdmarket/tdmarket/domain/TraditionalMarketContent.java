package com.hallym.tdmarket.tdmarket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class TraditionalMarketContent {

    @Id @GeneratedValue
    @Column(name = "maket_content_id")
    private Long id;

    @OneToOne(mappedBy = "traditionalMarketContent", fetch = FetchType.LAZY)
    private TraditionalMarket traditionalMarket;
    @OneToMany
    private List<Image> images = new ArrayList<>();


    private String parkingContent;
    private String marketContent;

}
