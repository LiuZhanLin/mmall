package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    User selectLogin(@Param("username") String username,@Param("password") String password);

    int checkEmail(String email);

    String selectQuestionByUsername(String username);

    int checkAnswer(@Param("username")String username,@Param("question")String question,@Param("password")String password);

    int updatePasswordByUsername(@Param("password")String password,@Param("username")String username);

    int checkPassword(@Param("password") String password,@Param("userId") Integer userId);

    int checkEmailByUserid(@Param("email") String email,@Param("userId") Integer userId);
}