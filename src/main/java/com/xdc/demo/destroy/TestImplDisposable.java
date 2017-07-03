package com.xdc.demo.destroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.ExitCodeGenerator;

/**
 * Created by Administrator on 2017/7/3.
 */
public class TestImplDisposable implements DisposableBean,ExitCodeGenerator{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public int getExitCode(){
        return 5;
    }

    @Override
    public void destroy()throws Exception{
        logger.info("我被销毁了、、、、、我是用的@TestImplDisposable的方法、、、、、、");
    }
}
