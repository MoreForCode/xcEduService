package com.vue.demo.dao;

import com.vue.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 操作持久层
 */
@Mapper
public interface UserDao {

    List<User> findAll();

    User findById(Integer id);

    void updateUser(User user);


}
