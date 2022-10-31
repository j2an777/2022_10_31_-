package com.hallym.tdmarket.tdmarket;

import com.hallym.tdmarket.tdmarket.domain.Address;
import com.hallym.tdmarket.tdmarket.domain.Image;
import com.hallym.tdmarket.tdmarket.domain.ImageType;
import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitDB {
    private final InitService initService;

    @PostConstruct
    public void Init() {
        initService.dbInit1();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;

        public void dbInit1() {
            Image image1 = new Image();
            image1.setImageType(ImageType.FOODS_STORE);
            image1.setOriginal_file_name("level1");
            image1.setStored_file_path("/static/img/level1.jpg");
            em.persist(image1);
            Image image2 = new Image();
            image2.setImageType(ImageType.FOODS_STORE);
            image2.setOriginal_file_name("level2");
            image2.setStored_file_path("/static/img/level2.jpg");
            em.persist(image2);

            Image image3 = new Image();
            image3.setImageType(ImageType.FOODS_STORE);
            image3.setOriginal_file_name("level3");
            image3.setStored_file_path("/static/img/level3.jpg");
            em.persist(image3);

            Image image4 = new Image();
            image4.setImageType(ImageType.FOODS_STORE);
            image4.setOriginal_file_name("level4");
            image4.setStored_file_path("/static/img/level4.jpg");
            em.persist(image4);

            Image image5 = new Image();
            image5.setImageType(ImageType.FOODS_STORE);
            image5.setOriginal_file_name("level5");
            image5.setStored_file_path("/static/img/level5.jpg");
            em.persist(image5);

            Image image6 = new Image();
            image6.setImageType(ImageType.FOODS_STORE);
            image6.setOriginal_file_name("level6");
            image6.setStored_file_path("/static/img/level6.jpg");
            em.persist(image6);


            Image mainImage1 = new Image();
            mainImage1.setImageType(ImageType.MAIN);
            mainImage1.setOriginal_file_name("level6");
            mainImage1.setStored_file_path("/static/img/bmarket.jpg");
            em.persist(mainImage1);
            Image mainImage2 = new Image();
            mainImage2.setImageType(ImageType.MAIN);
            mainImage2.setOriginal_file_name("level6");
            mainImage2.setStored_file_path("/static/img/nmarket.jpg");
            em.persist(mainImage2);
            Image mainImage3 = new Image();
            mainImage3.setImageType(ImageType.MAIN);
            mainImage3.setOriginal_file_name("level6");
            mainImage3.setStored_file_path("/static/img/pmarket.jpg");
            em.persist(mainImage3);

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
