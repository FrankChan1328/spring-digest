package sourcecode.applicationevent.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextClosedEvent;

/**
 * ApplicationContext 初始化或刷新完成后触发的事件
 * Event raised when an {@code ApplicationContext} gets initialized or refreshed.
 *
 * @author Juergen Hoeller
 * @since 04.03.2003
 * @see ContextClosedEvent
 */
@SuppressWarnings("serial")
public class ContextRefreshedEvent extends ApplicationContextEvent {

    /**
     * Create a new ContextRefreshedEvent.
     * @param source the {@code ApplicationContext} that has been initialized
     * or refreshed (must not be {@code null})
     */
    public ContextRefreshedEvent(ApplicationContext source) {
        super(source);
    }

}
