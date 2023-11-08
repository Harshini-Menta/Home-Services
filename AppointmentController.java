package com.home.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.entity.Appointment;
import com.home.services.AppointmentService;


@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	 @Autowired
	    private AppointmentService appointmentService;

	    @PostMapping("/appoint")
	    public ResponseEntity<String> createAppointment(@RequestBody Appointment appointment) {
	        appointmentService.createAppointment(appointment);
	        return ResponseEntity.ok("Appointment is created");
	    }
	    @GetMapping("/appointment/{appointmentid}")
	    public List<Integer> getAppointmentIdsByUserId(@PathVariable Integer appointmentid) {
	        return appointmentService.getAppointmentId(appointmentid);
	    }
}
