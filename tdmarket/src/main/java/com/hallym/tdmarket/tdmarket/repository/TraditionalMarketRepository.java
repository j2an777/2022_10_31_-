package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;

import java.util.List;

public interface TraditionalMarketRepository {

    void save(TraditionalMarket traditionalMarket);

    TraditionalMarket findOne(Long id);
    List<TraditionalMarket> findAll();
    List<TraditionalMarket> findByName(String name);

    List<TraditionalMarket> findAllWithFoodsStore(Long id);
}
