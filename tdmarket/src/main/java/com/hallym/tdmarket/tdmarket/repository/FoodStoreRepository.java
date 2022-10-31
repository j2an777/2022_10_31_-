package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.FoodsStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FoodStoreRepository {

    void save(FoodsStore foodsStore);
    List<FoodsStore> findAll();
    List<FoodsStore> findAllByPage(int start, int end);

}
