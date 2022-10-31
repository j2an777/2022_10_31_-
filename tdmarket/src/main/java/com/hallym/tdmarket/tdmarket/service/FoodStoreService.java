package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.FoodsStore;
import com.hallym.tdmarket.tdmarket.repository.FoodStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface FoodStoreService {

    Long save(FoodsStore foodsStore);

    List<FoodsStore> findFoodStores();
    List<FoodsStore> findFoodStoresByPage(int start, int end);

}
