package com.home.repositories;

import org.springframework.data.repository.CrudRepository;

import com.home.entity.Appointment;

public interface AppointmentRespository extends CrudRepository<Appointment, Integer> {

}
