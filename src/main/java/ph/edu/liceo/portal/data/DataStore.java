package ph.edu.liceo.portal.data;

import java.util.ArrayList;

import ph.edu.liceo.portal.model.Appointment;
import ph.edu.liceo.portal.model.ConsultationRequest;
import ph.edu.liceo.portal.model.MedicalRecord;
import ph.edu.liceo.portal.model.User;

public class DataStore {

    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Appointment> appointments = new ArrayList<>();
    public static ArrayList<ConsultationRequest> consultationRequests = new ArrayList<>();
    public static ArrayList<MedicalRecord> medicalRecords = new ArrayList<>();

    private static int nextUserId = 1;
    private static int nextAppointmentId = 1;
    private static int nextConsultationId = 1;
    private static int nextMedicalRecordId = 1;

    public static int getNextUserId() {
        return nextUserId++;
    }

    public static int getNextAppointmentId() {
        return nextAppointmentId++;
    }

    public static int getNextConsultationId() {
        return nextConsultationId++;
    }

    public static int getNextMedicalRecordId() {
        return nextMedicalRecordId++;
    }
}