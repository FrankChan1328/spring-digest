package sourcecode.applicationevent.listener;

import java.util.EventListener;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * <p> 事件监听者
 * ApplicationListener 充当了事件监听者角色，它是一个接口，里面只定义了一个 onApplicationEvent（）方法来处理ApplicationEvent。
 * ApplicationListener接口类源码如下，可以看出接口定义看出接口中的事件只要实现了 ApplicationEvent就可以了。
 * 所以，在 Spring中我们只要实现 ApplicationListener 接口实现 onApplicationEvent() 方法即可完成监听事件
 * 
 * Interface to be implemented by application event listeners.
 * Based on the standard {@code java.util.EventListener} interface
 * for the Observer design pattern.
 *
 * <p>As of Spring 3.0, an ApplicationListener can generically declare the event type
 * that it is interested in. When registered with a Spring ApplicationContext, events
 * will be filtered accordingly, with the listener getting invoked for matching event
 * objects only.
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @param <E> the specific ApplicationEvent subclass to listen to
 * @see org.springframework.context.event.ApplicationEventMulticaster
 */
@FunctionalInterface
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}