package models;
import java.util.ArrayList;
public class Patient {
    private String Name;
    private int patientNumber;
    private static int patientCounter = 1;
    private ArrayList<Service> Services;

    public Patient(String name) {
        this.Name = name;
        this.patientNumber = patientCounter++;
        this.Services = new ArrayList<>();
       
    }
    
    public String getName() {
        return Name;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public ArrayList<Service> getServices() {
        return Services;
    }
    public void addService(Service service) {
        if (Services == null) {
            Services = new ArrayList<>();
        }
        Services.add(service);
    }
    public int calculateTotalCost() {
        int totalCost = 0;
        if (Services != null) {
            for (Service s: Services) {
                totalCost += s.getPrice();          }
        }
        return totalCost;
    }
}



