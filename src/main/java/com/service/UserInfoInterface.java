package com.service;

import com.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userInfoInterface")
public interface UserInfoInterface {

    List<UserInfo> userlist();

    UserInfo user(Integer id);


}
