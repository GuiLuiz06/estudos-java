package aumentoS.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp.name + ", $ " + String.format("%.2f", emp.netSalary()));

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println(emp.toString());

    }

}
