package com.jewely.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jewely.dto.Product;
import com.jewely.frame.MyMapper;

@Mapper
@Repository
public interface ProductMapper extends MyMapper<Integer, Product>{
    
}
