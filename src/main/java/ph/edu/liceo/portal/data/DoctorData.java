package ph.edu.liceo.portal.data;

import java.util.ArrayList;

import ph.edu.liceo.portal.model.Doctor;

public class DoctorData {

    private ArrayList<Doctor> doctors;

    public DoctorData() {
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public Doctor findByEmail(String email) {

        for (Doctor doctor : doctors) {

            if (doctor.getEmail().equalsIgnoreCase(email)) {
                return doctor;
            }
        }

        return null;
    }

    public Doctor findById(int id) {

        for (Doctor doctor : doctors) {

            if (doctor.getId() == id) {
                return doctor;
            }
        }

        return null;
    }
}