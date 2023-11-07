package com.home.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.entity.Appointment;
import com.home.repositories.AppointmentRespository;
@Service
public class AppointmentService {
	@Autowired
    private AppointmentRespository appointmentRepository;
	public void  createAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
	}
	 public List<Integer> getAppointmentId(Integer appointmentId) {
	        Appointment appointment = appointmentRepository.findById(appointmentId).orElse(null);
	        if (appointment != null) {
	            List<Integer> appointmentIds = new ArrayList<>();
	            appointmentIds.add(appointment.getAppointmentid());
	            return appointmentIds;
	        } else {
	            return Collections.emptyList();
	        }
	    }

}
