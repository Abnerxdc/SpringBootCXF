//package springtest;
//
//import com.xdc.demo.bean.User;
//import com.xdc.demo.service.impl.UserServiceImpl;
//import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.test.IntegrationTest;
//import org.apache.axis.client.Service;
//import org.apache.axis.client.Call;
//import org.apache.axis.encoding.XMLType;
//
//import javax.xml.namespace.QName;
//
///**
// * Created by Administrator on 2017/6/5.
// */
//public class Client {
//    private static Logger logger = LoggerFactory.getLogger(Client.class);
//    private static String iServiceUrl = "http://localhost:8080/test/user?wsdl";
//    private static String iNameSpace = "http://service.demo.xdc.com/";
//
//    public static void main(String args[]) throws Exception{
//
//        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
//        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/test/user?wsdl");
//        //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
////        Object[] objects = client.invoke("getUser", "411001");
////        Object[] getName = client.invoke("getName", "411001");
////        Object[] getCoo = client.invoke("getCoo" );
////
////        //输出调用结
////        logger.debug("*****" + objects[0].toString());
////        logger.debug("*****" + getName[0].toString());
////        logger.debug("*getCoo***" + getCoo[0]);
//        String iJsonArg = "411001";
//        callService(iServiceUrl,"",iNameSpace,iJsonArg,"");
//
//    }
//
//    public static String callService(String iServiceUrl,
//                                     String iOperationName,
//                                     String iNameSpace,
//                                     String iJsonArg,
//                                     String iGeneralArg){
//        String res = "";
//        try{
//            Service service = new Service();
//            Call call = (Call)service.createCall();
//            call.setTimeout(12000);
//            // 设置service所在URL
//            call.setTargetEndpointAddress(iServiceUrl);
//            // 方法名(processService)与MyService.java方法名保持一致
////            call.setOperationName("getUser");
//            // Object 数组封装了参数，参数为"This is Test!",调用processService(String arg)
////            String ret = (String) call.invoke(new Object[] { iJsonArg });
//            call.setOperationName(new QName(iNameSpace, "getUser"));
//            call.addParameter(new QName(iNameSpace,"userId"), //设置要传递的参数
//                    org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
//            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型
////            call.setUseSOAPAction(true);
//            res = call.invoke(new Object[]{"411001"}).toString();
//            System.out.println(res);
//        }catch (Exception e){
//            logger.error("",e);
//        }
//        return res;
//    }
//
//}
