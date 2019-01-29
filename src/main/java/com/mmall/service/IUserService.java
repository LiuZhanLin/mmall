package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username , String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkVilid(String str,String type);

    ServerResponse<String> forgetGetQuestion(String username);

    ServerResponse<String> checkAnswer(String username,String question,String answer);

    public ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);

    public ServerResponse<String> resetPassword(User user,String passwordOld,String passwordNew);

    public ServerResponse<User> update_infomation(User user);

    ServerResponse<User> getInfomation(Integer userId);

    public ServerResponse checkAdminRole(User user);

}
