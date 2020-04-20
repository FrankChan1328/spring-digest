package sourcecode.applicationevent.casessimplespring;

import org.junit.Before;
import org.junit.Test;

import sourcecode.applicationevent.casessimplespring.service.CarService;
import sourcecode.applicationevent.casessimplespring.service.OrderService;
import sourcecode.applicationevent.casessimplespring.service.SmsService;
import sourcecode.applicationevent.casessimplespring.simplespring.BravoApplicationContext;

public class DemoTest {

    // 之所以设计成public static，是为了能在OrderService中拿到SmsService，毕竟我没实现Autowired自动注入
    public static BravoApplicationContext applicationContext;
    public static  SmsService smsService;
    public static OrderService orderService;
    public static CarService carService;

    @Before
    public void initApplicationContext() {
        applicationContext = new BravoApplicationContext();
        smsService =  (SmsService) applicationContext.getBean("sourcecode.applicationevent.casessimplespring.service.SmsService");
        orderService = (OrderService) applicationContext.getBean("sourcecode.applicationevent.casessimplespring.service.OrderService");
        carService = (CarService) applicationContext.getBean("sourcecode.applicationevent.casessimplespring.service.CarService");
    }

    @Test
    public void testSpringEvent() {
        // 用户下单（试着点进去，把orderService发布的事件改为OtherEvent）
        orderService.order();
    }

}

//山寨版里没实现以下功能：
//@Configuration
//public class AsyncEventConfig {
//
//    @Bean(name = "applicationEventMulticaster")
//    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
//        SimpleApplicationEventMulticaster eventMulticaster
//                = new SimpleApplicationEventMulticaster();
//
//        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
//        return eventMulticaster;
//    }
//
//}
