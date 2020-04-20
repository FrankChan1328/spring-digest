package sourcecode.applicationevent.publisher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.PayloadApplicationEvent;

/**
 * ApplicationEventPublisher 充当了事件的发布者，它也是一个接口。
 * 
 * Interface that encapsulates event publication functionality.
 * Serves as super-interface for {@link ApplicationContext}.
 *
 * @author Juergen Hoeller
 * @author Stephane Nicoll
 * @since 1.1.1
 * @see ApplicationContext
 * @see ApplicationEventPublisherAware
 * @see org.springframework.context.ApplicationEvent
 * @see org.springframework.context.event.EventPublicationInterceptor
 */
@FunctionalInterface
public interface ApplicationEventPublisher {

    /**
     * Notify all <strong>matching</strong> listeners registered with this
     * application of an application event. Events may be framework events
     * (such as RequestHandledEvent) or application-specific events.
     * @param event the event to publish
     * @see org.springframework.web.context.support.RequestHandledEvent
     */
    default void publishEvent(ApplicationEvent event) {
        publishEvent((Object) event);
    }

    /**
     * 【注释】ApplicationEventPublisher 接口的publishEvent（）这个方法在AbstractApplicationContext类中被实现，
     * 阅读这个方法的实现，你会发现实际上事件真正是通过ApplicationEventMulticaster来广播出去的。
     * 
     * Notify all <strong>matching</strong> listeners registered with this
     * application of an event.
     * <p>If the specified {@code event} is not an {@link ApplicationEvent},
     * it is wrapped in a {@link PayloadApplicationEvent}.
     * @param event the event to publish
     * @since 4.2
     * @see PayloadApplicationEvent
     */
    void publishEvent(Object event);

}
