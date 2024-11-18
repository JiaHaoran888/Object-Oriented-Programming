import java.util.ArrayList;

public class AssignmentOne {

    private static ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) 
    {

        // Part 3 – Using classes and objects
        GeneralPractitioner generalPractitioner1 = new GeneralPractitioner(1, "Zhang", 25, "Family Medicine","123456");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "Liu", 28, "Pediatrics","654321");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "Wang", 56, "Internal Medicine","123654");

        EmergencyDoctor emergencyDoctor1 = new EmergencyDoctor(4, "Zhao", 36, "Night Shift","Emergency Medicine");
        EmergencyDoctor emergencyDoctor2 = new EmergencyDoctor(5, "Qian", 44, "Day Shift","Critical Care");

        generalPractitioner1.printInformation();
        generalPractitioner2.printInformation();
        generalPractitioner3.printInformation();
        emergencyDoctor1.printInformation();
        emergencyDoctor2.printInformation();
        System.out.println("---------------------------------");


        // Part 5 – Collection of appointments
        createAppointment("zhou", "1111111", "08:00", new GeneralPractitioner(1, "Zhang", 25, "Family Medicine","123456"));
        createAppointment("wu", "2222222", "10:00", new GeneralPractitioner(2, "Liu", 28, "Pediatrics","654321"));
        createAppointment("zheng", "3333333", "14:00", new EmergencyDoctor(4, "Zhao", 36, "Night Shift","Emergency Medicine"));
        createAppointment("li", "4444444", "16:00", new EmergencyDoctor(5, "Qian", 44, "Day Shift","Critical Care"));

        System.out.println("Existing Appointments:");
        printExistingAppointments();

        System.out.println("Cancelling appointment for li.");
        cancelBooking("4444444");

        System.out.println("Updated Appointments:");
        printExistingAppointments();
        System.out.println("---------------------------------");


    }

    public static void createAppointment(String patientName, String phoneNumber, String time, HealthProfessional doctor) {

        if (patientName.isEmpty() || phoneNumber.isEmpty() || time.isEmpty() || doctor == null)
        {
            System.out.println("Missing appointment information.");
            return;
        }
        Appointment appointment = new Appointment(patientName, phoneNumber, time, doctor);
        appointments.add(appointment);
    }

    public static void printExistingAppointments() {

        if (appointments.isEmpty())
        {
            System.out.println("No appointments exists.");
            return;
        }
        for (Appointment appointment : appointments)
        {
            appointment.printInformation();
        }
    }

    public static void cancelBooking(String phoneNumber) {

        for (int i = 0; i < appointments.size(); i++)
        {
            if (appointments.get(i).getPatientPhoneNumber().equals(phoneNumber)) {
                appointments.remove(i);
                System.out.println("Appointment canceled for phone number: " + phoneNumber);
                return;
            }
        }
        System.out.println("Appointment not found for phone number: " + phoneNumber);
    }


}
