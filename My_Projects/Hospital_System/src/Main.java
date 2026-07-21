import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static Scanner input = new Scanner(System.in);
   public static ArrayList<Patient> activePatients = new ArrayList<>();
    public static ArrayList<Patient> dischargedPatients = new ArrayList<>();
    public static Service[] hospitalServices = {
        new Service("General Checkup", 50),
        new Service("Blood Test", 30),
        new Service("X-Ray", 40000),
        new Service("ECG (Heart Test)", 50000),
        new Service("Surgery", 500000),
        new Service("ICU (Per Day)", 100000),
    };
    public static void main(String[] args) {
        while (true) {
           MenuOptions. printMainMenu();
            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                   MenuOptions. addNewPatient();
                    break;
                case 2:
                   MenuOptions. addServiceToPatient();
                    break;
                case 3:
                    MenuOptions. searchPatient();
                    break;
                case 4:
                    MenuOptions. dischargePatient();
                    break;
                case 5:
                    MenuOptions. hospitalDashboard();
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    
}
