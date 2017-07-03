package com.xdc.demo.destroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Administrator on 2017/7/3.
 *
 * 使用这个方法要在程序的入口Application中添加@ServletComponentScan
 */
@WebListener
public class IndexListener implements ServletContextListener{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void contextDestroyed(ServletContextEvent arg0){
        logger.info("开始销毁，调用@WebListener的销毁方法");
    }
    @Override
    public void contextInitialized(ServletContextEvent arg0){

    }
}
