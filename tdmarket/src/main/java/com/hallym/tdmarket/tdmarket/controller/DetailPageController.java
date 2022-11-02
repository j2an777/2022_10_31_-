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
        model.addAttribute("market", market);

        return "marketPage";
    }
}
