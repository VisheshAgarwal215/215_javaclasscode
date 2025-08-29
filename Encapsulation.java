import java.util.*;
class EmployeeEncap{
    private int Account_balance;
    private int upi_pin=998899;
    public void setBalance(int balance){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your UPI pin");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            Account_balance=balance;
            System.out.println("Congratulation Salary is credited");
        }
        else{
            System.out.println("Salary not credited");
        }
    }
    public int getBalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your UPI pin");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            System.out.println("Your Account balance is: " + Account_balance);  
            return Account_balance;
        }
        else{
            System.out.println("Invalid UPI pin");
            return -1;
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        EmployeeEncap emp = new EmployeeEncap();
        emp.setBalance(10000);
        emp.getBalance();
    }
}