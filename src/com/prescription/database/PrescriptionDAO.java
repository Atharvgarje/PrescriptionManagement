package com.prescription.database;

import com.prescription.model.Prescription;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionDAO {

    // Method to add a prescription to the database
    public void addPrescription(Prescription prescription) {
        String query = "INSERT INTO Prescriptions (patient_id, doctor_id, prescription_date, medication, dosage, duration) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, prescription.getPatient().getId()); // Assuming Patient has a getId() method
            statement.setInt(2, prescription.getDoctorId()); // Assuming you have a doctorId field in Prescription
            statement.setDate(3, Date.valueOf(prescription.getPrescriptionDate())); // Convert LocalDate to java.sql.Date
            statement.setString(4, String.join(", ", prescription.getMedications())); // Convert List to String
            statement.setString(5, prescription.getDosage()); // Assuming you have a dosage field
            statement.setString(6, prescription.getDuration()); // Assuming you have a duration field
            statement.executeUpdate(); // Execute the insert operation
        } catch (SQLException e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
    }

    // Method to retrieve all prescriptions from the database
    public List<Prescription> getAllPrescriptions() {
        List<Prescription> prescriptions = new ArrayList<>();
        String query = "SELECT * FROM Prescriptions";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("prescription_id");
                int patientId = resultSet.getInt("patient_id"); // Assuming you will fetch patient info later
                LocalDate prescriptionDate = resultSet.getDate("prescription_date").toLocalDate();
                String medication = resultSet.getString("medication");
                String dosage = resultSet.getString("dosage");
                String duration = resultSet.getString("duration");
                String doctorNotes = resultSet.getString("doctor_notes"); // Assuming you have this field
                
                // Create a Prescription object and add it to the list
                // You might need to create a way to fetch the patient by ID
                prescriptions.add(new Prescription(id, null, List.of(medication.split(", ")), prescriptionDate, doctorNotes)); // Update with patient later
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
        return prescriptions; // Return the list of prescriptions
    }
}
