package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarketContent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class TraditionalMarketContentRepositoryImpl implements TraditionalMarketContentRepository{

    private final EntityManager em;
    @Override
    public void save(TraditionalMarketContent traditionalMarketContent) {
        em.persist(traditionalMarketContent);
    }

    @Override
    public TraditionalMarketContent findMarketContentById(Long id) {
        return em.find(TraditionalMarketContent.class, id);
    }
}
