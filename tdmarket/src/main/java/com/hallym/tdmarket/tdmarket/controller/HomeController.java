package com.hallym.tdmarket.tdmarket.controller;

import com.hallym.tdmarket.tdmarket.domain.FoodsStore;
import com.hallym.tdmarket.tdmarket.domain.Image;
import com.hallym.tdmarket.tdmarket.domain.TraditionalMarket;
import com.hallym.tdmarket.tdmarket.service.FoodStoreService;
import com.hallym.tdmarket.tdmarket.service.ImageService;
import com.hallym.tdmarket.tdmarket.service.TraditionalMarketService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ImageService imgService;
    private final FoodStoreService foodStoreService;
    @RequestMapping("/")
    public String home(Model model) {

        List<Image> mainImages = imgService.findImages();

        List<FoodsStore> foodStores = foodStoreService.findFoodStores();
        model.addAttribute("mainImages", mainImages);
        model.addAttribute("foodStores", foodStores);

        return "index";
    }


}
