package com.miaoshademo.service.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author benben.li
 * @date 2019/2/26 17:33
 */
@Data
public class UserRequestDto implements Serializable {
    private Integer id;
    private String name;
    private String  encrptPassword;
}
