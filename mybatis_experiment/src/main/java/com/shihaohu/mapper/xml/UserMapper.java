package com.shihaohu.mapper.xml;

import com.shihaohu.pojo.Picture;
import com.shihaohu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface UserMapper {
    //1.获取粉丝最多的人
    List<User> getBigv();
    //2.分页获取指定用户照片
    List<Picture> getUserPictures(@Param("userId")int userId, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    //3.分页获取指定用户指定时间段内发布的照片，当start_time为空时表示开始时间不限，end_time为空时表示到当前时间
    List<Picture> getUserPictures2(@Param("userId")int userId, @Param("startTime") Timestamp startTime, @Param("endTime")Timestamp endTime, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    //4.获取指定用户关注的用户
    List<User> getFollows(@Param("userId") int userId);
    //5.分页获取指定用户关注的用户的照片
    List<Picture> getFollowPictures(@Param("userId") int userIdl, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    //6.分页获取指定用户关注的用户指定时间段的照片
    List<Picture> getFollowPictures2(@Param("userId") int userIdl,  @Param("startTime") Timestamp startTime, @Param("endTime")Timestamp endTime, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    //7.分页获取系统中最新上传的照片
    List<Picture> getRecentPictures(@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    //8.根据用户名模糊查询用户
    List<User> findUsersByName(@Param("userName") String userName);
    //9.根据照片名模糊查询照片信息
    List<Picture> findPicturesByName(@Param("pictureName") String pictureName);
    //10.根据照片的标签名查询照片信息
    List<Picture> findPicturesByTags(@Param("tags") String tags);



}
