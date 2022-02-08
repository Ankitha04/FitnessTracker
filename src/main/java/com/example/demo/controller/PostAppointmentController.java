package com.example.demo.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.ResponseStatus;
	import org.springframework.web.bind.annotation.RestController;
	import javax.validation.Valid;
	import com.example.demo.entity.Appointment;
	import com.example.demo.service.AppointmentService;

	@RestController
	public class PostAppointmentController {

	    @Autowired
	    AppointmentService appointmentService;


	    @GetMapping("/appointment")
		Iterable<Appointment> getAppointments() {
		      return appointmentService.getAppointment();
		 }


	    @PostMapping("/appointment")
		@ResponseStatus(code=HttpStatus.CREATED)
		void createContact(@RequestBody @Valid Appointment appointment) {

		appointmentService.saveContact(appointment);
		}





}
