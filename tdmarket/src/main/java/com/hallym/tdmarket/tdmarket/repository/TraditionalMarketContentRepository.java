package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarketContent;

public interface TraditionalMarketContentRepository {

    void save(TraditionalMarketContent traditionalMarketContent);
    TraditionalMarketContent findMarketContentById(Long id);
}
