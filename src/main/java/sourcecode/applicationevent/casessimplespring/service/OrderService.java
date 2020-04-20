package sourcecode.applicationevent.casessimplespring.service;

import sourcecode.applicationevent.casessimplespring.DemoTest;
import sourcecode.applicationevent.casessimplespring.myevent.OrderSuccessEvent;

/**
 * 订单服务
 */
public class OrderService {

    /**
     * 用户下单
     */
    public void order() {
        // 下单成功
        System.out.println("下单成功...");

        // 发短信通知用户（粗暴异步）
        new Thread(() -> {
            DemoTest.applicationContext.publishEvent(new OrderSuccessEvent(this));
        }).start();

        System.out.println("main线程结束");

        try {
            Thread.sleep(1000L * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}