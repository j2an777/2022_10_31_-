package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.FoodsStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class FoodStoreRepositoryImpl implements FoodStoreRepository{

    private final EntityManager em;

    @Override
    public void save(FoodsStore foodsStore) {
        em.persist(foodsStore);
    }

    @Override
    public List<FoodsStore> findAll() {
        return em.createQuery("select st from FoodsStore st", FoodsStore.class).getResultList();
    }

    @Override
    public List<FoodsStore> findAllByPage(int start, int end) {
        return em.createQuery("select st from FoodsStore st", FoodsStore.class)
                .setFirstResult(start)
                .setMaxResults(end)
                .getResultList();

    }
}
