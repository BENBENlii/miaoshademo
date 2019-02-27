package com.miaoshademo.server.export;

import com.miaoshademo.server.service.UserService;
import com.miaoshademo.service.request.UserRequestDto;
import com.miaoshademo.service.response.UserResponseDto;
import com.miaoshademo.service.service.UserSoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author benben.li
 * @date 2019/2/26 10:14
 */
@Service
public class UserExportService implements UserSoaService {
    @Autowired
    UserService userService;
    @Override
    public UserResponseDto querySoaUser(UserRequestDto requestDto) {
        UserResponseDto userResponseDto = userService.queryUser(requestDto);
        return userResponseDto;
    }
}
