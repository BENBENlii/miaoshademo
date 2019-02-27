package com.miaoshademo.service.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author benben.li
 * @date 2019/2/26 17:48
 */
@Data
public class UserResponseDto implements Serializable {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String telephone;
}
