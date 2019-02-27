package com.miaoshademo.web.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author benben.li
 * @date 2019/2/26 15:05
 */
@Data
public class UserResponseVO implements Serializable {
    private static final long serialVersionUID = 4452741625311644729L;
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String telephone;
}
