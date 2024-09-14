package io.github.sonnetsaif.applicationevent.handler;

import io.github.sonnetsaif.applicationevent.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordsServiceHandler {
    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent patientDischargeEvent) {
        // Update medical records
        System.out.println("Medical Records Service: Updating records for patient "
                +patientDischargeEvent.getPatientId()+" : "+Thread.currentThread().getName());
    }
}
