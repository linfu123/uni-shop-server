package com.unishop.server.service.serviceImpl;

import com.unishop.server.dao.ImageUrlDao;
import com.unishop.server.entities.ImageUrl;
import com.unishop.server.service.ImageUrlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageUrlService {


    @Resource
    private ImageUrlDao imageUrlDao;

    @Override
    public List<ImageUrl> findAll() {
        return imageUrlDao.findAll();
    }
}
