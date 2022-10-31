package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarketContent;

import java.util.List;

public interface TraditionalMarketContentService {
    Long join(TraditionalMarketContent traditionalMarketContent);
    TraditionalMarketContent findContent(Long id);
}
