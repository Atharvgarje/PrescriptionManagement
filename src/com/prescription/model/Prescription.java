package com.prescription.model; // Define the package where this class belongs

import java.time.LocalDate; // Import LocalDate for handling dates
import java.util.List; // Import List for using collections

public class Prescription { // Declare the Prescription class
    private int prescriptionId; // ID of the prescription
    private Patient patient; // The patient to whom the prescription belongs
    private List<String> medications; // List of medications prescribed
    private LocalDate prescriptionDate; // Date when the prescription was created
    private String doctorNotes; // Any notes from the doctor

    // Constructor to initialize Prescription object
    public Prescription(int prescriptionId, Patient patient, List<String> medications, LocalDate prescriptionDate, String doctorNotes) {
        this.prescriptionId = prescriptionId; // Assigning the prescription ID
        this.patient = patient; // Assigning the patient
        this.medications = medications; // Assigning the list of medications
        this.prescriptionDate = prescriptionDate; // Assigning the prescription date
        this.doctorNotes = doctorNotes; // Assigning the doctor's notes
    }

    // Getters and Setters
    public int getPrescriptionId() { return prescriptionId; } // Returns the prescription ID
    public void setPrescriptionId(int prescriptionId) { this.prescriptionId = prescriptionId; } // Sets the prescription ID

    public Patient getPatient() { return patient; } // Returns the associated patient
    public void setPatient(Patient patient) { this.patient = patient; } // Sets the associated patient

    public List<String> getMedications() { return medications; } // Returns the list of medications
    public void setMedications(List<String> medications) { this.medications = medications; } // Sets the list of medications

    public LocalDate getPrescriptionDate() { return prescriptionDate; } // Returns the prescription date
    public void setPrescriptionDate(LocalDate prescriptionDate) { this.prescriptionDate = prescriptionDate; } // Sets the prescription date

    public String getDoctorNotes() { return doctorNotes; } // Returns the doctor's notes
    public void setDoctorNotes(String doctorNotes) { this.doctorNotes = doctorNotes; } // Sets the doctor's notes

    // Method to display prescription details
    public void displayPrescription() {
        System.out.println("Prescription ID: " + prescriptionId);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Prescription Date: " + prescriptionDate);
        System.out.println("Medications: " + String.join(", ", medications));
        System.out.println("Doctor's Notes: " + doctorNotes);
    }
}
