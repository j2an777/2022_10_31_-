package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class TraditionalMarketRepositoryImpl implements TraditionalMarketRepository{

    private final EntityManager em;

    @Override
    public void save(TraditionalMarket traditionalMarket) {
        em.persist(traditionalMarket);
    }

    @Override
    public TraditionalMarket findOne(Long id) {
        return em.find(TraditionalMarket.class, id);
    }

    @Override
    public List<TraditionalMarket> findAll() {
        return em.createQuery("select tm from TraditionalMarket tm",TraditionalMarket.class).getResultList();
    }

    @Override
    public List<TraditionalMarket> findByName(String name) {
        return em.createQuery("select tm from TraditionalMarket tm where tm.name = :name", TraditionalMarket.class)
                .setParameter("name", name)
                .getResultList();
    }

}
