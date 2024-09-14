package io.github.sonnetsaif.applicationevent.dto;

import lombok.Data;

@Data
public class PatientDischargeRequest {

    private String patientId;
    private String patientName;

}