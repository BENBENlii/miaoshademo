package com.miaoshademo.server;

import com.miaoshademo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author benben.li
 * @date 2019/2/25 11:45
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String test() {
        String str = "This is only a test!!!";
        return str+"wahahhaha";
    }
}
