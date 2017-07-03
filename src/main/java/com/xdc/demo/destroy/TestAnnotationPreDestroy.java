package com.xdc.demo.destroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2017/7/3.
 */
@Component
public class TestAnnotationPreDestroy {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PreDestroy
    public void destroy() {

        logger.info("我被销毁了、、、、、我是用的@PreDestory的方式、、、、、、");
    }
}
