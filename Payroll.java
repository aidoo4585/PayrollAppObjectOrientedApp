import java.util.Scanner;
public class Payroll {
    public static void main(String[] Kenny) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Payroll..." + "\nPlease input the number of employees you would wish to view: ");
        int employees = input.nextInt();

        double rate, hours = 0;
        double salary = 0;
        double taxRate = 0;
        double bonus = 0;
        double payment = 0;

        for (int i = 0; i < employees; i++) {
            //Identify type of employee
            System.out.println(
                    "Employee "+ (i+1) + ", select employment type: " + "\n1.Part-time " + "\n2.Fulltime " + "\n3.Manager");
            int type = input.nextInt();

            System.out.println(" To access payment information, please enter the credentials below correctly" + "\nEnter your name: ");
            String name = input.next();
            input.nextLine();

            System.out.println("Enter your address: ");
            String address = input.nextLine();

            System.out.println("Enter your number: ");
            double number = input.nextDouble();

            //Employee actor selection
            if (type == 1) {
                System.out.println("Access granted... \nEnter your hourly rate: ");
                rate = input.nextDouble();
                System.out.println("Enter the number of hours worked:");
                hours = input.nextDouble();
                PartTime partTime = new PartTime(name, address, number, rate, hours);
                partTime.setPartTimePayment();
                partTime.getPartTimePayment(payment);
                System.out.println(partTime.printPartTimeInfo() + "\n");
            }

            if (type == 2) {
                System.out.println("Access granted... \nEnter your monthly salary: ");
                salary = input.nextDouble();
                System.out.println("Enter the tax rate: ");
                taxRate = input.nextDouble();
                Fulltime fulltime = new Fulltime(name, address, number, salary, taxRate);
                fulltime.setFulltimePayment();
                fulltime.getFulltimePayment(payment);
                System.out.println(fulltime.printFulltimeInfo() + "\n");
            }

            if (type == 3) {
                System.out.println("Access granted... \nEnter your monthly salary : ");
                salary = input.nextDouble();
                System.out.println("Enter the tax rate : ");
                taxRate = input.nextDouble();
                System.out.println("Enter your bonus: ");
                bonus = input.nextDouble();
                Manager manager = new Manager(name, address, number, salary, taxRate, bonus);
                manager.setManagerPayment();
                manager.getManagerPayment(payment);
                System.out.println(manager.printManagerInfo() + "\n");

            }

        }
        System.out.println("\nEmployee details displayed above" +
                            "\nprogram exiting..." +
                            "\nGoodbye!");
    }
}