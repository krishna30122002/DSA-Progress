/*que 1: create a class account and take four attributes account number, name, email and amount which are hidden from the public.
use the set and get function to update and print all the account details */
import java.util.Scanner;

class encapsulation {
    private long accountNo;
    private String name;
    private String email;
    private long amount;

    public void setDetails(long acc, String name, String email, long amt) {
        this.accountNo = acc;
        this.name = name;
        this.email = email;
        this.amount = amt;
    }

    public void getAccount() {
        System.out.println("Your Account Number is " + accountNo);
    }

    public void getName() {
        System.out.println("Your Name is " + name);
    }

    public void getEmail() {
        System.out.println("Your Email is " + email);
    }

    public void getAmount() {
        System.out.println("Your Amount is " + amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        encapsulation obj = new encapsulation();

        System.out.println("Enter Details");
        System.out.println("Your Account Number:");
        long accountNo = sc.nextLong();
        System.out.println("Your Name:");
        sc.next();
        String name = sc.nextLine();
        System.out.println("Your Email:");
        String email = sc.nextLine();
        System.out.println("Your Amount:");
        long amount = sc.nextLong();

        obj.setDetails(accountNo, name, email, amount);

        obj.getAccount();
        obj.getName();
        obj.getEmail();
        obj.getAmount();

        sc.close();
    }
}