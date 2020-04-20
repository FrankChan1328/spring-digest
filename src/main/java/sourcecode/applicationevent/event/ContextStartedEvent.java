package sourcecode.applicationevent.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * ApplicationContext 启动后触发的事件
 * Event raised when an {@code ApplicationContext} gets started.
 *
 * @author Mark Fisher
 * @author Juergen Hoeller
 * @since 2.5
 * @see ContextStoppedEvent
 */
@SuppressWarnings("serial")
public class ContextStartedEvent extends ApplicationContextEvent {

    /**
     * Create a new ContextStartedEvent.
     * @param source the {@code ApplicationContext} that has been started
     * (must not be {@code null})
     */
    public ContextStartedEvent(ApplicationContext source) {
        super(source);
    }

}
