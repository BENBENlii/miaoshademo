package com.miaoshademo.server.service.serviceImpl;

import com.miaoshademo.server.entity.UserPassword;
import com.miaoshademo.server.entity.UserInfo;
import com.miaoshademo.server.mapper.UserInfoMapper;
import com.miaoshademo.server.mapper.UserPasswordMapper;
import com.miaoshademo.server.service.UserService;
import com.miaoshademo.service.request.UserRequestDto;
import com.miaoshademo.service.response.UserResponseDto;
//import com.miaoshademo.web.common.BizException;
//import com.miaoshademo.web.common.ErrorCode;
//import com.miaoshademo.web.util.BeanMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author benben.li
 * @date 2019/2/26 10:10
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserPasswordMapper userPasswordMapper;
    @Override
    public UserResponseDto queryUser(UserRequestDto userRequestDto) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userRequestDto,userInfo);
//        UserInfo userInfo = BeanMapper.map(userRequestDto,UserInfo.class);
        List<UserInfo> userInfoList = userInfoMapper.selectByPrimaryKeySelective(userInfo);
//        if (userInfoList == null) {
//            throw new BizException(ErrorCode.USER_NOT_EXIST);
//        }
        UserPassword userPassword = userPasswordMapper.selectByUserId(userInfoList.get(0).getId());
        if(userPassword.getEncrptPassword().equals(userRequestDto.getEncrptPassword())){
            UserResponseDto userResponseDto = new UserResponseDto();
            BeanUtils.copyProperties(userInfoList.get(0),userResponseDto);
//            UserResponseDto userResponseDto = BeanMapper.map(userInfoList.get(0),UserResponseDto.class);
            return userResponseDto;
        }else {
//            throw new BizException(ErrorCode.USER_PASSWORD_NOT_MATCH);
            return null;
        }
    }
}
