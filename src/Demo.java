import java.util.*;
public class Demo {
    public static void main(String[] args) {

        Manager a = new Manager("E001","Mark","HR",15000,"Manager");
        Manager b = new Manager("E012","Peter","R&D",15000,"Manager");
        Clerk c = new Clerk("E056","Samuel","Accounts",10000,"Clerk");
        Employee d = new Employee("E089","Gabriel","H&R",12500.0,"New Hire");



        int daysOfWork = 20;

        ArrayList <Employee> employees = new ArrayList<Employee>();
        employees.add(a);
        employees.add(b);
        employees.add(c);
        employees.add(d);


            for (int i = 0; i < employees.size(); i++) {
                System.out.println(employees.get(i));
                System.out.println();
            }


        if(!a.equal(c)){
            System.out.println(a.getName() + " and " + b.getName() + " have different designation");
        } else {
            System.out.println(a.getName() + " and " + b.getName() + " have same designation");
        }

        System.out.println();



        int [] presentDay = new int[4];

        Scanner  input = new Scanner(System.in);
        for(int i  = 0; i < employees.size(); i++){
            System.out.print("Enter the number of days Employee " + employees.get(i).getEmployeeID() +" is Present out of 20 :");
            presentDay[i] = input.nextInt();
        }


        double totDeduction = 0;

        System.out.printf("\n%-13s%-13s%-13s%-13s\n","Employee ID "," Present ", " Absent ", "Deductions");

        for (int i = 0; i < employees.size(); i++){
           double deduction = employees.get(i).deduction(presentDay[i], 20);
           totDeduction+= deduction;
            System.out.printf("%-13s%-13d%-13d$%-13.2f\n", employees.get(i).getEmployeeID(), presentDay[i], daysOfWork - presentDay[i], deduction);
        }
        System.out.println();
        System.out.println(" Total Deductions: " + totDeduction);

    }
}
