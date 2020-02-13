package com.sky.mapper;


import com.sky.domain.Video;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * video数据访问层
 */
public interface VideoMapper {


    @Select("select * from video")
    List<Video> findAll();

}
