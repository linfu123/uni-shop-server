package com.unishop.server.dao;

import com.unishop.server.entities.ImageUrl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ImageUrlDao {

    public List<ImageUrl> findAll();


}
