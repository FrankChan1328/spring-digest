package sourcecode.applicationevent.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextStartedEvent;

/**
 * ApplicationContext 停止后触发的事件
 * Event raised when an {@code ApplicationContext} gets stopped.
 *
 * @author Mark Fisher
 * @author Juergen Hoeller
 * @since 2.5
 * @see ContextStartedEvent
 */
@SuppressWarnings("serial")
public class ContextStoppedEvent extends ApplicationContextEvent {

    /**
     * Create a new ContextStoppedEvent.
     * @param source the {@code ApplicationContext} that has been stopped
     * (must not be {@code null})
     */
    public ContextStoppedEvent(ApplicationContext source) {
        super(source);
    }

}