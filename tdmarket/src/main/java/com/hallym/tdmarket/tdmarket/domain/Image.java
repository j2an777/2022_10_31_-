package com.hallym.tdmarket.tdmarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.ImageType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id @GeneratedValue
    @Column(name = "image_id")
    private Long id;

    private ImageType imageType;
    private String original_file_name;
    private String stored_file_path;

}
