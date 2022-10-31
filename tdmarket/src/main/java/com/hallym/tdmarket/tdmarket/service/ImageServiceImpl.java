package com.hallym.tdmarket.tdmarket.service;

import com.hallym.tdmarket.tdmarket.domain.Image;
import com.hallym.tdmarket.tdmarket.domain.ImageType;
import com.hallym.tdmarket.tdmarket.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService{

    private final ImageRepository imageRepository;
    @Override
    public void join(Image image) {
        imageRepository.save(image);
    }

    @Override
    public List<Image> findImages() {
        return imageRepository.findAll();
    }

    @Override
    public Image findOne(Long id) {
        return imageRepository.findByImageId(id);
    }

    @Override
    public List<Image> findMainImages() {
        return imageRepository.findAllByType(ImageType.MAIN);
    }
}
