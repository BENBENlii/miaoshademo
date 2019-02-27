package com.miaoshademo.web.controller;

import com.miaoshademo.service.DemoService;
import com.miaoshademo.web.common.CommonResponse;
import com.miaoshademo.web.request.TestRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author benben.li
 * @date 2019/2/25 11:35
 */
@RestController
@RequestMapping("/dev")
public class TestController {
    @Autowired
    private DemoService demoService;
    @PostMapping("/test")
    public CommonResponse<String> test(@RequestBody TestRequest request){
        CommonResponse<String> response = new CommonResponse<String>();
        String str = demoService.test()+request.getString();
        response.setData(str);
        return response;
    }
}
