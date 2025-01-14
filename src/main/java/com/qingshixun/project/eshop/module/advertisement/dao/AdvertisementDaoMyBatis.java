package com.qingshixun.project.eshop.module.advertisement.dao;

import com.qingshixun.project.eshop.dto.AdvertisementDTO;
import com.qingshixun.project.eshop.web.MyBatisRepository;

import java.util.List;

@MyBatisRepository
public interface AdvertisementDaoMyBatis {

    
    List<AdvertisementDTO> getAdvertisements();

}
