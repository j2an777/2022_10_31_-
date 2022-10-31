package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;
import com.hallym.tdmarket.tdmarket.repository.TraditionalMarketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TraditionalMarketServiceImpl implements TraditionalMarketService{

    private final TraditionalMarketRepository tdRepository;

    @Override
    @Transactional
    public Long join(TraditionalMarket traditionalMarket) {
        validateDuplicateMarket(traditionalMarket);
        tdRepository.save(traditionalMarket);
        return traditionalMarket.getId();
    }

    private void validateDuplicateMarket(TraditionalMarket traditionalMarket) {
        List<TraditionalMarket> findResult = tdRepository.findByName(traditionalMarket.getName());
        if (!findResult.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다");
        }
    }

    @Override
    public List<TraditionalMarket> findMarkets() {
        return tdRepository.findAll();
    }

    @Override
    public List<TraditionalMarket> findWithFoodsStore(Long id) {
        return tdRepository.findAllWithFoodsStore(id);
    }

    @Override
    public TraditionalMarket findOne(Long memberId) {
        return tdRepository.findOne(memberId);
    }
}
