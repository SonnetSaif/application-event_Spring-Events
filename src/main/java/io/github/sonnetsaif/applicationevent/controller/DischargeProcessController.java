package io.github.sonnetsaif.applicationevent.controller;

import io.github.sonnetsaif.applicationevent.dto.PatientDischargeRequest;
import io.github.sonnetsaif.applicationevent.service.PatientDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discharge/api")
public class DischargeProcessController {

    @Autowired
    private PatientDischargeService patientDischargeService;

    @PostMapping("/startProcess")
    public String dischargePatient(@RequestBody PatientDischargeRequest request) {
        return patientDischargeService.dischargePatient(request.getPatientId(), request.getPatientName());
    }
}
