package com.miaoshademo.web.common;

/**
 * @author benben.li
 * @date 2019/2/26 14:11
 */
public class BizException extends RuntimeException {
    private long code;
    private String msg;
    public BizException(){super();}
    public BizException(long code,String msg){
        super();
        this.code = code;
        this.msg = msg;
    }
    public BizException(long code,String msg,Throwable throwable){
        super(throwable);
        this.code = code;
        this.msg  = msg;
    }
    public BizException(ErrorCode errorCode){
        this.code = errorCode.getErrorCode();
        this.msg = errorCode.getErrorMsg();
    }
    public BizException(ErrorCode errorCode,String errInfo,Throwable throwable){
        super(throwable);
        this.code = errorCode.getErrorCode();
        this.msg = errorCode.getErrorMsg()+":"+errInfo;
    }
    public BizException(ErrorCode errorCode,String errInfo){
        this.code = errorCode.getErrorCode();
        this.msg = errorCode.getErrorMsg()+":"+errInfo;
    }
}
