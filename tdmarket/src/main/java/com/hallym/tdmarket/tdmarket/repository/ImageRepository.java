package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.Image;
import com.hallym.tdmarket.tdmarket.domain.ImageType;

import java.util.List;

public interface ImageRepository {
    void save(Image image);
    List<Image> findAll();
    Image findByImageId(Long imageId);
    List<Image> findAllByType(ImageType imageType);
}
