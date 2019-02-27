package com.miaoshademo.web.common;

/**
 * @author benben.li
 * @date 2019/2/26 11:38
 */
public enum ErrorCode {
    /************公共返回码**************/
    SUCCESS(0L,"处理成功"),
    FAIL(1L,"处理失败"),

    SERVER_ERROR(400L,"服务端错误"),
    REMOTE_ERROR(401L,"远程错误"),
    USER_NOT_EXIST(10001L,"用户不存在"),
    USER_PASSWORD_NOT_MATCH(10002L,"账户密码不匹配"),
    UNKNOWN_ERROR(10000L,"未知错误")
    ;
    private long errorCode;
    private String errorMsg;
    private ErrorCode(Long errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    public Long getErrorCode(){
        return errorCode;
    }
    public String getErrorMsg(){
        return errorMsg;
    }
}
