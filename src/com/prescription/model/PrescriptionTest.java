package com.prescription.model; // Define the package for the test class

import java.time.LocalDate; // Import LocalDate for date handling
import java.util.Arrays; // Import Arrays for creating lists

public class PrescriptionTest {
    public static void main(String[] args) { // Main method to run the test
        // Create a new Patient
        Patient patient = new Patient(1, "John Doe", LocalDate.of(1990, 1, 1), "123 Elm St", "1234567890");
        
        // Create a new Prescription
        Prescription prescription = new Prescription(
            101, // Prescription ID
            patient, // Patient object
            Arrays.asList("Medication A", "Medication B", "Medication C"), // List of medications
            LocalDate.now(), // Prescription date
            "Take after meals." // Doctor's notes
        );

        // Display prescription details
        prescription.displayPrescription();
    }
}
