## Prescription Management System

### Project Overview
The Prescription Management System is a Java-based application designed to track and manage prescriptions for patients visiting multiple hospitals. It helps ensure that combinations of medications prescribed by different doctors do not result in harmful side effects. The system efficiently stores and retrieves prescription details for users, ensuring patient safety and easy access to prescription history.

### Key Features
- **Patient and Doctor Management**: Create and manage records for patients and doctors.
- **Prescription Tracking**: Store and manage prescriptions for each patient, including medications prescribed.
- **Database Integration**: Uses **MySQL** for efficient data storage and retrieval of patients, doctors, and prescriptions.
- **Side Effect Warning**: Provides alerts for potential side effects caused by the combination of multiple medications.
- **Expandable**: The system can be extended to include more features, such as user authentication, automated alerts, and patient history analytics.

### Technologies Used
- **Java (Core Java, OOP Concepts)**: For developing the backend of the application.
- **MySQL**: For database storage and management of user and prescription data.
- **JDBC (Java Database Connectivity)**: To interact with the MySQL database.
- **DAO (Data Access Object)**: For managing database queries and transactions.
  
### Project Structure
- **com.prescription.model**: Contains the Java classes for `Patient`, `Doctor`, `Prescription`, and `Medicine`.
- **com.prescription.dao**: Manages database operations (CRUD) for each entity.
- **com.prescription.service**: Handles the business logic, connecting the model and database.

### Installation and Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/prescription-management-system.git
   ```
2. Install **MySQL** and create the necessary tables using the provided SQL scripts in the `db-scripts` folder.
3. Configure the database connection in the `dbconfig.properties` file.
4. Run the project using your preferred IDE (e.g., Eclipse, IntelliJ, or VS Code).

### Database Schema
- **User Table**: Stores basic information about users (doctors, patients, or administrators).
- **Patient Table**: Stores patient-specific details, linked to the User table.
- **Doctor Table**: Stores doctor-specific details, linked to the User table.
- **Prescription Table**: Tracks all prescriptions for patients, with fields for doctor, patient, and medications.

### Future Enhancements
- **User Authentication**: Add login functionality for doctors and patients.
- **Prescription Analytics**: Analyze prescription data for patterns and insights.
- **Alert System**: Notify patients about upcoming refills or potential drug interactions.

