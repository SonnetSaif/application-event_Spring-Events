package io.github.sonnetsaif.applicationevent.handler;

import io.github.sonnetsaif.applicationevent.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    @Async
    @EventListener
    public void processBill(PatientDischargeEvent patientDischargeEvent){
        System.out.println("Notification Service: Sending discharge notification for patient "
                +patientDischargeEvent.getPatientName() +" : "+Thread.currentThread().getName());
    }
}
