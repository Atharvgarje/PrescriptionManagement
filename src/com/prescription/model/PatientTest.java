package com.prescription.model;
import java.time.LocalDate; 
public class PatientTest {
    public static void main(String[] args) {
        // Create a new Patient
        Patient patient = new Patient(1, "Atharv", LocalDate.of(2002, 8,14), "Patil Nagar", "1234567890");
        
        // Print Patient details
        System.out.println("Patient ID: " + patient.getId());
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Patient DOB: " + patient.getDateOfBirth());
        System.out.println("Patient Address: " + patient.getAddress());
        System.out.println("Patient Phone: " + patient.getPhone());
    }
}
