package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;
import com.hallym.tdmarket.tdmarket.domain.TraditionalMarketContent;
import com.hallym.tdmarket.tdmarket.repository.TraditionalMarketContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TraditionalMarketContentServiceImpl implements TraditionalMarketContentService{

    private final TraditionalMarketContentRepository tmc;

    @Override
    @Transactional
    public Long join(TraditionalMarketContent traditionalMarketContent) {
        tmc.save(traditionalMarketContent);
        return traditionalMarketContent.getId();
    }


    @Override
    public TraditionalMarketContent findContent(Long id) {
        return tmc.findMarketContentById(id);
    }
}
