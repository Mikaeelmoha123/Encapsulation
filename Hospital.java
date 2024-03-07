public class Hospital {
    private Doctor doctor;
    private Patient patient;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Details:");
        if (doctor != null) {
            System.out.println("Doctor:");
            doctor.displayDetails();
        } else {
            System.out.println("No doctor assigned to the hospital.");
        }

        if (patient != null) {
            System.out.println("Patient:");
            patient.displayDetails();
        } else {
            System.out.println("No patient assigned to the hospital.");
        }
    }
}
