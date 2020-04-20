package sourcecode.applicationevent.casessimplespring.myevent;

import sourcecode.applicationevent.casessimplespring.simplespring.BravoApplicationEvent;

public class OtherEvent extends BravoApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public OtherEvent(Object source) {
        super(source);
    }
}
