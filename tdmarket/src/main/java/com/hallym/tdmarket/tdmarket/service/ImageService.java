package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.Image;

import java.util.List;

public interface ImageService {
    void join(Image image);
    List<Image>findImages();
    Image findOne(Long id);
    List<Image>findMainImages();
}
