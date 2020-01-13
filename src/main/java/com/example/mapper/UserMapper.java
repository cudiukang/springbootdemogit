package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户Mapper
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id 用户id
     * @return 返回用户对象
     */
    User getUserById(Integer id);

    /**
     * 分页查询数据
     * @return 返回用户对象集合
     */
    List<User> userPager();
}
