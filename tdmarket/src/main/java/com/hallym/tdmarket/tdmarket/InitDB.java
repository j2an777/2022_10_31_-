package com.hallym.tdmarket.tdmarket;

import com.hallym.tdmarket.tdmarket.domain.Address;
import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

@Component
@RequiredArgsConstructor
public class InitDB {
    private final InitService initService;

    @PostConstruct
    public void Init() {

    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;

        public void voidbInit1() {
            TraditionalMarket market = new TraditionalMarket();

            market.setName("남부 시장");
            market.setAddress(new Address("강원 춘천시", "영서로", "2352-21"));
            market.setPhoneNum("033-253-5814");
            market.setOpening("상설+매월 끝자리 2,7일 마다 열리는 5일장");
            market.setTraffic("풍물시장 정류장 도보2분");
            market.setParking("가능");
            market.setFoods("국수, 해장국, 생선구이, 족발, 호떡 등");
            market.setSights("의암공원");
            market.setFacilites("편의점, 고객안내센터, 고객휴게실");

        }


    }
}
