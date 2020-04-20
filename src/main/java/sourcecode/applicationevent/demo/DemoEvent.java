package sourcecode.applicationevent.demo;

import org.springframework.context.ApplicationEvent;

/**
 * 定义一个事件,继承自ApplicationEvent并且写相应的构造函数
 * <p>当调用 DemoPublisher 的 publish() 方法的时候，比如 demoPublisher.publish("你好") ，控制台就会打印出:接收到的信息是：你好 。
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
