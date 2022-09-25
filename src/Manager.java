public class Manager extends Employee {
    public Manager() {
        this("E000", "No name", "no department", 0.0, "no designation");
    }

    public Manager(String EmployeeID, String name, String department, double salary, String designation) {
        super(EmployeeID, name, department, salary, designation);
    }

    public double addBonus() {
        double bonus = 300;
        return getSalary() + bonus;
    }

    public double deduction(double absentDays, double totalDays) {
        return addBonus() - (addBonus() * (absentDays / totalDays));
    }


}