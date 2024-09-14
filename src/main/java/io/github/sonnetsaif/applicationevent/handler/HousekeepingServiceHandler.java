package io.github.sonnetsaif.applicationevent.handler;

import io.github.sonnetsaif.applicationevent.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HousekeepingServiceHandler {
    @Async
    @EventListener
    public void cleanAndAssign(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge of "
                +patientDischargeEvent.getPatientName()+" : "+Thread.currentThread().getName());
    }
}
