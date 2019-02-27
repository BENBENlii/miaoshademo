package com.miaoshademo.service.service;

import com.miaoshademo.service.request.UserRequestDto;
import com.miaoshademo.service.response.UserResponseDto;

/**
 * @author benben.li
 * @date 2019/2/26 10:20
 */
public interface UserSoaService {
    UserResponseDto querySoaUser(UserRequestDto requestDto);
}
