package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service
public class AppointmentService {
	@Autowired
    AppointmentRepository appointmentRepository;


	public void saveContact(Appointment appointment) {
		appointmentRepository.save(appointment);

	}

	public Iterable<Appointment> getAppointment() {

		return appointmentRepository.findAll();
	}

}
