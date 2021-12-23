package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Patient;
import com.example.demo.repositories.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

  @Autowired
  PatientRepository patientRepository;

  public List<Patient> getPatients() {
    return (List<Patient>) patientRepository.findAll();
  }

	public Patient createCoach(Patient patient) {
		return patientRepository.save(patient);
	}
}
