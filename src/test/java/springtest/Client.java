package springtest;

import com.xdc.demo.bean.User;
import com.xdc.demo.service.impl.UserServiceImpl;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.IntegrationTest;

/**
 * Created by Administrator on 2017/6/5.
 */
public class Client {
    private static Logger logger = LoggerFactory.getLogger(Client.class);
    public static void main(String args[]) throws Exception{

        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/test/user?wsdl");
        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
        Object[] objects = client.invoke("getUser", "411001");
        Object[] getName = client.invoke("getName", "411001");
        Object[] getCoo = client.invoke("getCoo" );

        //输出调用结果
        logger.debug("*****" + objects[0].toString());
        logger.debug("*****" + getName[0].toString());
        logger.debug("*getCoo***" + getCoo[0]);

    }

}
