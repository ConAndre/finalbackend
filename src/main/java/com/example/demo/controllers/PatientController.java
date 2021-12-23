package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.Patient;
import com.example.demo.services.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PatientController {
  @Autowired
  PatientService patientService;


  @GetMapping("api/v1/patients")
  public List<Patient> getPatients() {
    return patientService.getPatients();
  }

	@PostMapping("api/v1/patients")
	public Patient createCoach(@RequestBody Patient patient) {
		return patientService.createCoach(patient);
	}
}
