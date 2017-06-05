package com.xdc.demo.service.impl;

import com.xdc.demo.bean.User;
import com.xdc.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/5.
 * 对接口类进行实现（业务类）
 */
  // targetNamespace 指向业务类所在路径   endpointInterface指向接口类所在路径
@WebService(targetNamespace="http://service.demo.xdc.com/",endpointInterface = "com.xdc.demo.service.UserService")
public class UserServiceImpl implements UserService {
    private Map<String, User> userMap = new HashMap<String, User>();
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public UserServiceImpl() {
        System.out.println("向实体类插入数据");
        User user = new User();
        user.setUserId("411001");
        user.setUsername("zhansan");
        user.setAge("20");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId("411002");
        user.setUsername("lisi");
        user.setAge("30");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId("411003");
        user.setUsername("wangwu");
        user.setAge("40");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);
    }

    @Override
    public String getName(String userId) {
        return "liyd-" + userId;
    }

    @Override
    public String getUser(String userId) {
        logger.info("userMap112233是:" + userMap);
        User user = userMap.get(userId);
        String result = "name:"+user.getUserName()+" age:"+user.getAge()+" id:"+user.getUserId();
        return result;
    }
    @Override
    public String getCoo(){

        return "Hello Word!";
    }

    public String getCoN(){
        logger.debug("1122334455");
        return "Hello Word!";
    }
}
