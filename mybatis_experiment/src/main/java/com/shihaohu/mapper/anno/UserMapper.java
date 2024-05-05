package com.shihaohu.mapper.anno;

import com.shihaohu.pojo.Picture;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //10.根据照片的标签名查询照片信息
    @Select("select * from picture where tags = #{tags}")
    List<Picture> findPicturesByTags(@Param("tags") String tags);
}
