package com.xdc.demo.service;

import com.xdc.demo.bean.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2017/6/5.
 * 创建接口类
 */
@WebService
public interface UserService {
    @WebMethod
    String getName(@WebParam(name = "userId",targetNamespace="http://service.demo.xdc.com/") String userId);
    @WebMethod
    String getUser(@WebParam(name = "userId",targetNamespace="http://service.demo.xdc.com/") String userId);
    @WebMethod
    String getCoo();
}
