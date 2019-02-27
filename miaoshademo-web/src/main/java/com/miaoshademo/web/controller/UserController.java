package com.miaoshademo.web.controller;

import com.miaoshademo.service.request.UserRequestDto;
import com.miaoshademo.service.response.UserResponseDto;
import com.miaoshademo.service.service.UserSoaService;
import com.miaoshademo.web.common.CommonResponse;
import com.miaoshademo.web.request.BaseUserRequest;
import com.miaoshademo.web.response.UserResponseVO;
import com.miaoshademo.web.util.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author benben.li
 * @date 2019/2/26 10:31
 */
@RestController
@RequestMapping("dev/user")
public class UserController {
    @Autowired
    private UserSoaService userSoaService;
    @PostMapping("/queryUser")
    public CommonResponse<UserResponseVO> queryUser(@RequestBody BaseUserRequest request){
        CommonResponse<UserResponseVO> response = new CommonResponse<>();
        UserResponseDto userResponseDto = userSoaService.querySoaUser(BeanMapper.map(request, UserRequestDto.class));
        UserResponseVO userResponseVO = BeanMapper.map(userResponseDto,UserResponseVO.class);
        response.setData(userResponseVO);
        return response;
    }

}
