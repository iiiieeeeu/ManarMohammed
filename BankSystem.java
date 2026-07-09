
import java.util.Scanner;

public class BankSystem {
    // رصيد الحساب البنكي الافتراضي
    
    private static double balance = 1000.0; 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome! Your current balance is: $" + balance);
        System.out.print("Enter amount to deposit : ");
        double depositAmount = input.nextDouble();
        deposit(depositAmount);
        
        System.out.print("Enter amount to withdraw : ");
        double withdrawAmount = input.nextDouble();
        withdraw(withdrawAmount);
        
        System.out.println("Final Balance: $" + balance);
    }
    
    // دالة الإيداع
    public static void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited successfully!");
        }else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }
    
    // دالة السحب
    public static void withdraw(double amount) {
        // خطأ منطقي هنا في التحقق من الرصيد الكافي
        if (balance - amount < 0) {
            System.out.println("Error: Insufficient funds!");
        } else {    
        balance = balance - amount;
        System.out.println("Withdrawn successfully!");
    }
}
}

    



