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
    String getName(@WebParam(name = "userId") String userId);
    @WebMethod
    String getUser(String userId);
    @WebMethod
    String getCoo();
}
