package com.unishop.server.controller;

import com.unishop.server.dao.ImageUrlDao;
import com.unishop.server.entities.CommonResult;
import com.unishop.server.entities.ImageUrl;
import com.unishop.server.service.ImageUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImageUrlController {

    @Autowired
    private ImageUrlService imageUrlService;

    @GetMapping(value = "/images/getall")
    public CommonResult getAllImages(){
        List<ImageUrl> list = imageUrlService.findAll();
        if(list.size()>0){
            return new CommonResult(200,"获取数据成功",list);
        }else{
            return new CommonResult(200,"未获取到数据",null);
        }
    }
}
