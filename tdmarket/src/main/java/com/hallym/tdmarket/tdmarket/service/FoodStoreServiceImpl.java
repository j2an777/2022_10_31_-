package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.FoodsStore;
import com.hallym.tdmarket.tdmarket.repository.FoodStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class FoodStoreServiceImpl implements FoodStoreService{

    private final FoodStoreRepository foodStoreRepository;

    @Override
    public Long save(FoodsStore foodsStore) {

        foodStoreRepository.save(foodsStore);
        return foodsStore.getId();
    }

    @Override
    public List<FoodsStore> findFoodStores() {
        return foodStoreRepository.findAll();
    }


    @Override
    public List<FoodsStore> findFoodStoresByPage(int start, int end) {
        return foodStoreRepository.findAllByPage(start, end);
    }
}
