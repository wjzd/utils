package com.serviceImpl;

import com.dao.UserInfoMapper;
import com.pojo.UserInfo;
import com.service.UserInfoInterface;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userInfoInterface")
public class UserInfoImpl implements UserInfoInterface {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userlist() {
        return userInfoMapper.userlist();
    }

    @Override
    @Test
    public UserInfo user(Integer id) {

        return userInfoMapper.selectByPrimaryKey(id);
    }


}
