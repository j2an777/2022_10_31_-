package com.hallym.tdmarket.tdmarket.repository;

import com.hallym.tdmarket.tdmarket.domain.Image;
import com.hallym.tdmarket.tdmarket.domain.ImageType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ImageRepositoryImpl implements ImageRepository{

    private final EntityManager em;
    @Override
    public void save(Image image) {
        em.persist(image);
    }

    @Override
    public List<Image> findAll() {
        return em.createQuery("select img from Image img", Image.class).getResultList();
    }

    @Override
    public Image findByImageId(Long imageId) {
        return em.find(Image.class, imageId);
    }

    @Override
    public List<Image> findAllByType(ImageType imageType) {
        return em.createQuery("select img from Image img where img.imageType =: imageType", Image.class)
                .setParameter("imageType", imageType)
                .getResultList();

    }
}
