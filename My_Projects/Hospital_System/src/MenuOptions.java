public class MenuOptions {
    public static void printMainMenu() {
        System.out.println("\n--------------------------------------------------------");
        System.out.println("|                HOSPITAL MANAGEMENT SYSTEM             |");
        System.out.println("--------------------------------------------------------");
        System.out.println("| 1. Add New Patient                                    |");
        System.out.println("| 2. Add Service to Patient                             |");
        System.out.println("| 3. Search Patient                                     |");
        System.out.println("| 4. Print Invoice                                      |");
        System.out.println("| 5. Hospital Dashboard                                 |");
        System.out.println("| 6. Exit                                               |");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter your choice (1-6): ");
    }

    public static void addNewPatient() {
        System.out.println("\n---------------------------------------------------");
        System.out.println("|                ADD NEW PATIENT                  |");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter Patient's Full Name: ");
        String name = Main.input.nextLine();
        Patient p = new Patient(name);
        Main.activePatients.add(p);
        System.out.println("Patient added successfully!");
        System.out.println("Patient Name: " + p.getName());
        System.out.println("Patient Number: " + p.getPatientNumber());
        System.out.println("***************************************************************");
    }

    public static void addServiceToPatient() {
        System.out.println("\n------------------------------------------------");
        System.out.println("|                ADD SERVICE TO PATIENT         |");
        System.out.println("------------------------------------------------");
        System.out.println("Enter Patient Number: ");
        int patientNumber = Main.input.nextInt();
        Main.input.nextLine();
        Patient targetPatient = null;
        for (Patient p : Main.activePatients) {
            if (p.getPatientNumber() == patientNumber) {
                targetPatient = p;
                break;
            }
        }
        if (targetPatient == null) {
            System.out.println("Patient not found.");
            return;
        }
        System.out.println("\nAvailable Services:");
        for (int i = 0; i < Main.hospitalServices.length; i++) {
            System.out.printf("%d. %-20s | %s IQD\n", (i + 1),
                    Main.hospitalServices[i].getName(), " - $" + Main.hospitalServices[i].getPrice());
        }
        System.out.println("\n Select a service to add (1-" + Main.hospitalServices.length + "): ");
        int serviceChoice = Main.input.nextInt();
        Main.input.nextLine();
        if (serviceChoice < 1 || serviceChoice > Main.hospitalServices.length) {
            System.out.println("Invalid service choice.");
            return;
        }
        Service selectedService = Main.hospitalServices[serviceChoice - 1];
        targetPatient.addService(selectedService);
        System.out.println("Service added successfully to patient " + targetPatient.getName() + ".");
    }

    public static void searchPatient() {
        System.out.println("\n------------------------------------------------");
        System.out.println("|                SEARCH PATIENT                 |");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter Patient Number: ");
        int patientNumber = Main.input.nextInt();
        Main.input.nextLine();
        Patient targetPatient = null;
        for (Patient p : Main.activePatients) {
            if (p.getPatientNumber() == patientNumber) {
                targetPatient = p;
                break;
            }
        }
        if (targetPatient == null) {
            System.out.println("Patient not found.");
            return;
        }
        System.out.println("Patient Name: " + targetPatient.getName());
        System.out.println("Patient Number: " + targetPatient.getPatientNumber());
        System.out.println("Services Availed:");
        if (targetPatient.getServices() != null && !targetPatient.getServices().isEmpty()) {
            for (Service s : targetPatient.getServices()) {
                System.out.printf("- %-20s | %,d IQD\n", s.getName(), s .getPrice());
            }
            System.out.printf("Total Cost: %,d IQD\n", targetPatient.calculateTotalCost());
        } else {
            System.out.println("No services availed yet.");
        }
    }

    public static void dischargePatient() {
        System.out.println("\n------------------------------------------------");
        System.out.println("|                DISCHARGE PATIENT              |");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter Patient Number: ");
        int patientNumber = Main.input.nextInt();
        Main.input.nextLine();
        Patient targetPatient = null;
        for (Patient p : Main.activePatients) {
            if (p.getPatientNumber() == patientNumber) {
                targetPatient = p;
                break;
            }
        }
        if (targetPatient == null) {
            System.out.println("Patient not found.");
            return;
        }
        System.out.println("Patient " + targetPatient.getName() + " discharged successfully.");
        System.out.println("\n===========================================================");
        System.out.println("|                    HOSPITAL INVOICE                     |");
        System.out.println("============================================================");
        System.out.println("Patient Name : " + targetPatient.getName());
        System.out.println("Patient Number : " + targetPatient.getPatientNumber());
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Amount Due: %,d IQD\n", targetPatient.calculateTotalCost());
        System.out.println("=============================================================");
        Main.activePatients.remove(targetPatient);
        Main.dischargedPatients.add(targetPatient);
        System.out.println("Patient " + targetPatient.getName()
                + " has been discharged and moved to the discharged patients list.");

    }

    public static void hospitalDashboard() {
        System.out.println("\n------------------------------------------------");
        System.out.println("|              HOSPITAL DASHBOARD               |");
        System.out.println("---------------------------------------------------");
        int activeCount = Main.activePatients.size();
        int dischargedCount = Main.dischargedPatients.size();
        int totalPatients = activeCount + dischargedCount;
        double totalRevenue = 0;
        for (Patient p : Main.dischargedPatients) {
            totalRevenue += p.calculateTotalCost();
        }
        System.out.println("Total Active Patients: " + activeCount);
        System.out.println("Total Discharged Patients: " + dischargedCount);
        System.out.println("Total Patients: " + totalPatients);
        System.out.printf("Total Revenue Collected  : %,.0f IQD\n", totalRevenue);
        System.out.println("============================================================");
    }
}
