package com.unishop.server.service;

import com.unishop.server.entities.ImageUrl;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ImageUrlService {

    List<ImageUrl> findAll();
}
