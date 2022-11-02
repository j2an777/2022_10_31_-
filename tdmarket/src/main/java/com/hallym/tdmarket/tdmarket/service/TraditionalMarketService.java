package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;

import java.util.List;

public interface TraditionalMarketService {


    Long join(TraditionalMarket traditionalMarket);
    List<TraditionalMarket> findMarkets();
    TraditionalMarket findOne(Long memberId);
    List<TraditionalMarket> findWithFoodsStore(Long id);
}
