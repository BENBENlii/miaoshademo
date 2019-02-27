package com.miaoshademo.web.request;

import lombok.Data;

/**
 * @author benben.li
 * @date 2019/2/26 15:16
 */
@Data
public class BaseUserRequest {
    private Integer id;
    private String name;
    private String encrptPassword;
}
