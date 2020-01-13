package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 根据用户id获取用户对象
     * @param id 用户id
     * @return
     */
    User getUserById(Integer id);
    /**
     * 分页查询数据
     * @return 返回用户对象集合
     */
    List<User> userPager(Integer curPage, Integer pageSize);
}
