package com.hallym.tdmarket.tdmarket.controller;

import com.hallym.tdmarket.tdmarket.domain.Address;
import com.hallym.tdmarket.tdmarket.domain.Image;
import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;
import com.hallym.tdmarket.tdmarket.service.TraditionalMarketContentService;
import com.hallym.tdmarket.tdmarket.service.TraditionalMarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class DetailPageController {

    private final TraditionalMarketService traditionalMarketService;

    @GetMapping("/{marketId}/info")
    public String detailPage(@PathVariable(name = "marketId") Long id, Model model) {

        TraditionalMarket market = traditionalMarketService.findOne(id);
        MarketDTO marketDTO = new MarketDTO(market.getId(), market.getImages(), market.getFoods(),
                market.getParking(), market.getTraffic(), market.getOpening(),market.getPhoneNum(),
                market.getSights(),market.getFacilites());
        model.addAttribute("market", marketDTO);

        return "marketPage";
    }

    static class MarketDTO {
        private Long id;
        private List<Image> images = new ArrayList<>();
        private String foods;
        private String parking;
        private String traffic;
        private String opening;
        private String phoneNum;
        private String sights;
        private String facilites;

        public MarketDTO(Long id, List<Image> images, String foods, String parking, String traffic, String opening, String phoneNum, String sights, String facilites) {
            this.facilites = facilites;
            this.foods = foods;
            this.id = id;
            this.images = images;
            this.opening = opening;
            this.phoneNum = phoneNum;
            this.traffic = traffic;
            this.parking = parking;
            this.sights = sights;
        }

    }
}
