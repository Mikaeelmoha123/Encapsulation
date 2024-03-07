public class HospitalManagementSystem {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.setName("Dr.Angie");
        doctor.setAge(51);
        doctor.setSpecialization("Dermatologist");


        Patient patient = new Patient();
        patient.setName("Malcom john");
        patient.setAge(33);
        patient.setCondition("Eczema");


        Hospital hospital = new Hospital();


        hospital.setDoctor(doctor);
        hospital.setPatient(patient);


        hospital.displayHospitalDetails();
    }
}
