package com.miaoshademo.web.common;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author benben.li
 * @date 2019/2/26 10:36
 */
@Data
public class CommonResponse<T> implements Serializable {
    private long errcode;
    private String errmsg;
    private T data;
    //全局id
    private String ticket;
    public CommonResponse(){
        this.errcode = ErrorCode.SUCCESS.getErrorCode();
        this.errmsg = ErrorCode.SUCCESS.getErrorMsg();
        this.ticket = UUID.randomUUID().toString();
    }
    public CommonResponse(long code,String msg,T data){
        ticket = UUID.randomUUID().toString();
        this.errcode = code;
        this.errmsg = msg;
        this.data = data;
    }
    public CommonResponse(long code,String msg){
        this(code,msg,null);
    }
    public CommonResponse(long code){
        this(code,null,null);
    }

}
