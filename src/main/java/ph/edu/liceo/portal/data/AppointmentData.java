package ph.edu.liceo.portal.data;

import java.util.ArrayList;

import ph.edu.liceo.portal.model.Appointment;

public class AppointmentData {

    private ArrayList<Appointment> appointments;

    public AppointmentData() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public Appointment findById(int id) {

        for (Appointment appointment : appointments) {

            if (appointment.getId() == id) {
                return appointment;
            }
        }

        return null;
    }

    public ArrayList<Appointment> findByPatient(String patientName) {

        ArrayList<Appointment> result = new ArrayList<>();

        for (Appointment appointment : appointments) {

            if (appointment.getPatientName().equalsIgnoreCase(patientName)) {
                result.add(appointment);
            }
        }

        return result;
    }

    public ArrayList<Appointment> findByDoctor(String doctorName) {

        ArrayList<Appointment> result = new ArrayList<>();

        for (Appointment appointment : appointments) {

            if (appointment.getDoctorName().equalsIgnoreCase(doctorName)) {
                result.add(appointment);
            }
        }

        return result;
    }
}