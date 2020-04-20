package sourcecode.applicationevent.casessimplespring.service;

import sourcecode.applicationevent.casessimplespring.myevent.OtherEvent;
import sourcecode.applicationevent.casessimplespring.simplespring.BravoApplicationListener;

/**
 * @author bravo
 * @date 2020-02-09 18:09
 */
public class CarService implements BravoApplicationListener<OtherEvent> {

    @Override
    public void onApplicationEvent(OtherEvent event) {
        System.out.println("监听到OtherEvent，CarService执行了");
    }
}