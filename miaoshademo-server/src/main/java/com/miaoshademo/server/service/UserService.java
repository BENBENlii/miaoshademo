package com.miaoshademo.server.service;

import com.miaoshademo.service.request.UserRequestDto;
import com.miaoshademo.service.response.UserResponseDto;

/**
 * @author benben.li
 * @date 2019/2/26 10:09
 */
public interface UserService {
    UserResponseDto queryUser(UserRequestDto userRequestDto);
}
